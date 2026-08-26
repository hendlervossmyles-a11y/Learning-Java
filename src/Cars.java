// Challenge 1 Add a method inside Cars called displayDetails() that prints a single car's color and model.

public class Cars {
    String colorOfCar;
    String modelOfCar;
    int numberOfCars;
    int mileage;
    static int totalNumberOfCars;

    Cars(String modelOfCar, String colorOfCar)  {
        this.modelOfCar = modelOfCar;
        this.colorOfCar = colorOfCar;
        numberOfCars++; // ++ means to increment the value by 1
        totalNumberOfCars++;  // Because totalNumberOfCars is static it only applies to the class
        					 // Cars and will count every car.
    }

    public void displayDetails() {
        this.colorOfCar = colorOfCar;
        this.modelOfCar = modelOfCar;
        System.out.println("Model: " + modelOfCar + " Color: " + colorOfCar);

    }

    public void drive() {
        mileage += 50;
    }
}
