//package org.example.sp2pastpaperjan24.q6;
//
//public class Q6 {
//    import java.util.Comparator;
//
//    public class MyStringComparator implements Comparator<String> {
//
//        @Override
//        public int compare(String o1, String o2) {
//            if (o1 == null && o2 == null) {
//                return 0;
//            }
//            if (o1 == null) {
//                return -1;
//            }
//            if (o2 == null) {
//                return 1;
//            }
//
//            if (o1.length() < o2.length()) {
//                return -1;
//            }
//            if (o1.length() > o2.length()) {
//                return 1;
//            }
//
//            int cmp = o1.compareTo(o2);
//            if (cmp < 0) {
//                return -1;
//            }
//            if (cmp > 0) {
//                return 1;
//            }
//            return 0;
//        }
//    }
//}
