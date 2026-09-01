import java.util.Scanner;
import java.math.*;
public class Fundraiser {
	public static void main(String[] args) {
		double adult_ticket_cost = 19;
		double student_ticket_cost = 12.5;
		System.out.println("Welcome to ticket price calculator!\n\n"+"**Negatives will be converted to positve values**\n\n");
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter # of adult tickets here: ");
		double  adult_ticket = Math.abs(reader.nextInt());
		System.out.println("# Entered:" + adult_ticket);
		System.out.println("Enter # of student tickets here: ");
		double  student_ticket = Math.abs(reader.nextInt());
		System.out.println("# Entered: " + student_ticket);
		
		double final_cost = (adult_ticket*adult_ticket_cost)+(student_ticket*student_ticket_cost);
		System.out.println("Final Cost: "+final_cost+"$"); //Test

		
	}
	
	
}
