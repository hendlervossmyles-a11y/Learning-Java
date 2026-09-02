import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {

        // Assume that one pound of seed covers 20 square feet.
        Scanner reader = new Scanner(System.in);
        System.out.println("Width: ");
        Double width = reader.nextDouble();
        System.out.println("Height: ");
        Double height = reader.nextDouble();
        System.out.println("Number of Pounds per Bag of Seed:");
        int ppbs = reader.nextInt();
        System.out.println("Cost per Bag of Seed: ");
        Double cpb = reader.nextDouble();

        double area = height * width;
        double bags_needed = area / (ppbs*20);
        double total_cost = bags_needed * cpb;

        System.out.println("Total Area: "+area+"\n"+"Number of bags needed: "+bags_needed+"\n"+"Total cost: $ "+total_cost);




    }
}
