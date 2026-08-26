public class StaticPractice {
    public static void main(String[] args) {

        Cars car1 = new Cars("Hyundai", "Blue");
        Cars car2 = new Cars("Ford", "Red");
        Cars car3 = new Cars("Toyota", "Black");
        Cars car4 = new Cars("Lexus", "Green");

        System.out.println(car1.colorOfCar);
        System.out.println(car1.modelOfCar);
        System.out.println("Total number of cars:\t" + Cars.totalNumberOfCars);



    }
}
