public class Car {
    private String model;
    private int mileage = 0;
    private static int totalCars = 0;

    public Car(String model) {
        this(model, 0);
    }

    public Car(String model, int mileage) {
        this.model = model;
        this.mileage = mileage;
        totalCars++;
    }

    public String getModel() {
        return model;
    }

    public void drive() {
        mileage++;
        System.out.println("You've driven another mile!");
    }

    public static int getTotalCars() {
        return totalCars;
    }
}