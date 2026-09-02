import java.util.Scanner;

public class Deposits {
	public static void main(String args) {
		double num_days = 0;
		Scanner reader = new Scanner(System.in);
		

		System.out.println("Input Current Account Value in Dollars: ");
		double account_amount = reader.nextDouble();
		System.out.println("Value entered: "+account_amount+"\n");
		System.out.println("Enter Number of Simulation Days: ");
		num_days = reader.nextDouble();
		System.out.println("Number of Days Entered: "+num_days);

		account_amount = account_amount+(num_days*10);

		System.out.println("The value after "+num_days+" days is: "+account_amount); //Test
	}
	
	
}
