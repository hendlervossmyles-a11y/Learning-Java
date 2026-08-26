public class Cars {
    String colorOfCar;
    String modelOfCar;
    int numberOfCars;
    static int totalNumberOfCars;

    Cars(String modelOfCar, String colorOfCar)  {
        this.modelOfCar = modelOfCar;
        this.colorOfCar = colorOfCar;
        numberOfCars++; // ++ means to increment the value by 1
        totalNumberOfCars++;  // Because totalNumberOfCars is static it only applies to the class
        					 // Cars and will count every car.
    }
}
