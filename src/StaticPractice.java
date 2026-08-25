public class StaticPractice {
    public static void main(String[] args) {

        Cars car1 = new Cars("Hyundai", "Blue");
        Cars car2 = new Cars("Ford", "Red");

        System.out.println(car1.colorOfCar);
        System.out.println(car1.modelOfCar);
        System.out.println("Total number of cars:\t" + Cars.totalNumberOfCars);



    }
}
