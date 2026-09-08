package org.example.collections;
//1.	Different sets, different orders
//
//HashSet<String> does not preserve insertion order. The elements are arranged according to their hash codes and the internal bucket structure, so the printed order is not the order you inserted them in. It is not something you should rely on.
//
//LinkedHashSet<String> does preserve insertion order, so the output will be:
//
//[Java, C, PHP, JavaScript, Python, Rust, Haskell, Go, Prolog]
//TreeSet<String> stores elements in sorted order according to their natural ordering. For strings, that is alphabetical order, so the output will be:[C, Go, Haskell, Java, JavaScript, PHP, Prolog, Python, Rust]

//Set<String> h1 = new HashSet<>();
//Set<String> h2 = new LinkedHashSet<>();
//Set<String> h3 = new TreeSet<>();
//
//String[] langs = {"Java", "C", "PHP", "JavaScript", "Python", "Rust", "Haskell", "Go", "Prolog"};
//
//for (String s : langs) {
//    h1.add(s);
//    h2.add(s);
//    h3.add(s);
//}
//
//System.out.println(h1); // unpredictable order
//System.out.println(h2); // insertion order
//System.out.println(h3); // sorted order
//	2.	Points in lists and sets
//
//To make Point behave properly in the collections described in the sheet, you need:
//
//For List.contains(...), override equals(Object).
//
//For HashSet and LinkedHashSet, override both equals(Object) and hashCode().
//
//For TreeSet, either implement Comparable<Point> with compareTo(Point) or give the TreeSet a Comparator<Point>. The easiest answer here is to make Point implement Comparable<Point>.  ￼
//
//Worked version:

//public class Point implements Comparable<Point> {
//    private int x;
//    private int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void moveTo(Point remote) {
//        this.x = remote.x;
//        this.y = remote.y;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        Point other = (Point) obj;
//        return this.x == other.x && this.y == other.y;
//    }
//
//    @Override
//    public int hashCode() {
//        return 31 * x + y;
//    }
//
//    @Override
//    public int compareTo(Point other) {
//        if (this.x != other.x) {
//            return this.x - other.x;
//        }
//        return this.y - other.y;
//    }
//}

//public class Point implements Comparable<Point> {
//    private int x;
//    private int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void moveTo(Point remote) {
//        this.x = remote.x;
//        this.y = remote.y;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        Point other = (Point) obj;
//        return this.x == other.x && this.y == other.y;
//    }
//
//    @Override
//    public int hashCode() {
//        return 31 * x + y;
//    }
//
//    @Override
//    public int compareTo(Point other) {
//        if (this.x != other.x) {
//            return this.x - other.x;
//        }
//        return this.y - other.y;
//    }
//}

//Point p1 = new Point(3, 4);
//Point p2 = new Point(3, 4);
//
//System.out.println(p1.equals(p2)); // true
//
//List<Point> list = new ArrayList<>();
//list.add(p1);
//System.out.println(list.contains(p2)); // true
//
//Set<Point> set1 = new LinkedHashSet<>();
//set1.add(p1);
//System.out.println(set1.contains(p2)); // true
//
//Set<Point> set2 = new TreeSet<>();
//set2.add(p1);
//System.out.println(set2.contains(p2)); // true
//	3.	Modifying list and set elements
//
//Before mutation:
//	•	p1 = (3,4)
//	•	p2 = (3,4)
//	•	p3 = (11,12)
//
//Then p1.moveTo(p3) changes p1 to (11,12) while it is already inside the list and sets. The sheet is asking what happens if you mutate an element while it is stored in a collection.  ￼
//
//For the List:
//	•	list.contains(p1) is true
//	•	list.contains(p2) is false
//	•	list.contains(p3) is true
//
//Why:
//	•	the list still contains the same object reference p1
//	•	p2 is no longer equal to that object
//	•	p3 is equal in value to the mutated p1
//
//For LinkedHashSet:
//	•	set1.contains(p1) is usually false
//	•	set1.contains(p2) is false
//	•	set1.contains(p3) is usually false
//
//Why:
//HashSet and LinkedHashSet use hash codes to decide where to store and search for objects. After mutation, the point’s hash code changes, but the set has not re-positioned the object. So lookup can fail.
//
//For TreeSet:
//	•	set2.contains(p1) is unreliable / may be false
//	•	set2.contains(p2) is false
//	•	set2.contains(p3) is unreliable / may be false
//
//Why:
//TreeSet relies on sorted order from compareTo or a comparator. If you mutate an element after insertion, the tree structure may no longer match the ordering rule, so searching can fail.
//
//Main lesson:
//Do not mutate objects in a way that affects equality, hash code, or ordering while they are stored in a Set. Lists are safer in this respect, but even there the meaning of contains can change after mutation.
//	4.	Equal phones
//
//You want equality to depend on exact class, not just subclass relationship, so getClass() is appropriate. The sheet specifies:
//	•	OldPhone: same class and same brand
//	•	MobilePhone: same class, same brand, same call history
//	•	SmartPhone: same class, same brand, same call history  ￼
//
//A clean DRY version:
//public class OldPhone {
//    private String brand;
//
//    public OldPhone(String brand) {
//        this.brand = brand;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        OldPhone other = (OldPhone) obj;
//        return brand.equals(other.brand);
//    }
//
//    @Override
//    public int hashCode() {
//        return brand.hashCode();
//    }
//}
//public class MobilePhone extends OldPhone {
//    private List<String> callHistory = new ArrayList<>();
//
//    public MobilePhone(String brand) {
//        super(brand);
//    }
//
//    public List<String> getCallHistory() {
//        return callHistory;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        MobilePhone other = (MobilePhone) obj;
//        return getBrand().equals(other.getBrand())
//                && callHistory.equals(other.callHistory);
//    }
//
//    @Override
//    public int hashCode() {
//        return 31 * getBrand().hashCode() + callHistory.hashCode();
//    }
//}
//public class SmartPhone extends MobilePhone {
//    public SmartPhone(String brand) {
//        super(brand);
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        SmartPhone other = (SmartPhone) obj;
//        return getBrand().equals(other.getBrand())
//                && getCallHistory().equals(other.getCallHistory());
//    }
//
//    @Override
//    public int hashCode() {
//        return 31 * getBrand().hashCode() + getCallHistory().hashCode();
//    }
//}
//	5.	Hash set weirdness
//
//If you override equals but do not override hashCode, then two phones can be equal according to equals, but still have different hash codes inherited from Object.
//
//So:
//OldPhone p1 = new OldPhone("ACME");
//OldPhone p2 = new OldPhone("ACME");
//
//System.out.println(p1.equals(p2)); // true
//
//Set<OldPhone> set = new HashSet<>();
//set.add(p1);
//
//System.out.println(set.contains(p2)); // likely false
//Why:
//HashSet first uses hashCode() to find the bucket. Since p1 and p2 have different default hash codes, it looks in the wrong place and does not find the equal object.  ￼
//	6.	Implementing hashCode() in OldPhone
//
//Once you make hashCode() consistent with equals, the previous test works properly:
//@Override
//public int hashCode() {
//    return brand.hashCode();
//}

//Now:
//OldPhone p1 = new OldPhone("ACME");
//OldPhone p2 = new OldPhone("ACME");
//
//System.out.println(p1.equals(p2)); // true
//
//Set<OldPhone> set = new HashSet<>();
//set.add(p1);
//
//System.out.println(set.contains(p2)); // true
//Why:
//equal objects now produce the same hash code, so HashSet searches the correct bucket.
//	7.	hashCode() in subclasses
//
//For MobilePhone, since equality depends on brand and call history, hash code must also depend on brand and call history:
//@Override
//public int hashCode() {
//    return 31 * getBrand().hashCode() + callHistory.hashCode();
//}
//If SmartPhone uses the same equality rule as MobilePhone, its hashCode() should match that rule too.
//	8.	Working with maps
//
//The method should count how many times each element appears in the input collection. The sheet asks for a generic static method taking Collection<? extends E> and returning Map<E, Integer>.  ￼
//
//Worked answer:
//public static <E> Map<E, Integer> count(Collection<? extends E> items) {
//    Map<E, Integer> result = new HashMap<>();
//
//    for (E item : items) {
//        if (result.containsKey(item)) {
//            result.put(item, result.get(item) + 1);
//        } else {
//            result.put(item, 1);
//        }
//    }
//
//    return result;
//}
//List<String> words = List.of("a", "b", "a", "c", "b", "a");
//Map<String, Integer> counts = count(words);
//System.out.println(counts); // {a=3, b=2, c=1}
//Would Map<? extends E, Integer> be a good return type?
//
//No. Returning Map<E, Integer> is better. A wildcard in the return type makes the result less useful to the caller, because the exact key type becomes awkward to work with. Wildcards are usually more useful in parameters than in return types.
//	9.	Big enough redux
//
//A sensible collection-based solution is to use a Map<Integer, String> or Map<String, Integer>, depending on whether ID or name is the key.
//
//Example with ID as key:
//Map<Integer, String> employees = new HashMap<>();
//
//employees.put(1001, "Alice");
//employees.put(1002, "Bob");
//employees.put(1003, "Charlie");
//
//System.out.println(employees.get(1002)); // Bob

//Observation:
//The collections version is much shorter, clearer, and easier to resize than using arrays manually. You do not need to keep track of current capacity or copy arrays into bigger arrays.
//	10.	Pair with wildcards
//
//If your one-argument constructor originally looked like this:
//public Pair(T first) {
//    this.first = first;
//    this.second = first;
//}