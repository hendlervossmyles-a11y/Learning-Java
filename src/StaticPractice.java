public class StaticPractice {
    public static void main(String[] args) {

        Cars car1 = new Cars("Hyundai", "Blue");
        Cars car2 = new Cars("Ford", "Red");
        Cars car3 = new Cars("Toyota", "Black");
        Cars car4 = new Cars("Lexus", "Green");

        System.out.println(car1.colorOfCar);
        System.out.println(car1.modelOfCar);


//        car1.displayDetails();
        car2.drive();
        car3.drive();
//        System.out.println("The "+car2.colorOfCar + " " + car2.modelOfCar+ " has " + car2.mileage + " miles.");
        System.out.println("The "+car3.colorOfCar+" "+car3.modelOfCar+" has "+car3.mileage+" miles.");
        System.out.println("The "+car2.colorOfCar+" "+car2.modelOfCar+" has "+car2.mileage+" miles.");
        System.out.println("Total number of cars:\t" + Cars.totalNumberOfCars);

    }
}
