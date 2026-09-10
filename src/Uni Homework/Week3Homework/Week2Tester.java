
public class Week2Tester {

	public static void main(String[] args) {

		System.out.println("    !!!!! This program runs some tests on the Week2Functions functions. !!!!");
		System.out.println("    !!!!! This tester is not complete, and you are encouraged to modify it.!!!!");

		testGetReception();
		testCompareToAverage();
		testMoveOn();
		testHowLongUntilSafe();

	}
    //*********************************
	public static void testOneCompare(String country, int age)
	{
		System.out.println("For " + country + " with age " + age + ": " + Week2Functions.compareToAverage(country,age));

	}
	public static void testCompareToAverage()
	{
		System.out.println("\n ****** Testing compareToAverage *******");
		String country1 = new String("US");
		String country2 = new String("Canada");
		testOneCompare(country1, 80);
		testOneCompare(country2, 77);
		testOneCompare(country1, 85);
		testOneCompare(country2, 79);
	}
	public static void testMoveOn()
	{
		System.out.println("\n ****** Testing moveToNextRound *******");
		String[] instruments = {new String("violin"),new String("trumpet"),new String("oboe"), new String("clarinet")};
		int[] scores = {10,20,30};
		for (String inst: instruments)
			for (int score: scores)
			{
				String answer = Week2Functions.doTheyMoveToNextRound(inst,score);
				System.out.println("doTheyMoveToNextRound(\""+inst+"\"," + score +") returns " + answer);
			}
	}
    //*********************************
	public static void testOneReception(String genre, int view)
	{
		System.out.println("For " + genre + " show with rating " + view + ": " + Week2Functions.getReception(genre, view));
	}
	public static void testGetReception()
	{
		System.out.println("\n ***** Testing GetReception *****");
		String genre1 = new String("Comedy");
		String genre2 = new String("Horror");
		String genre3 = new String("SuperHero");
		testOneReception(genre1, 40);
		testOneReception(genre1, 10);
		testOneReception(genre2, 6);
		testOneReception(genre3, 50);
	}
	
    //*********************************
	public static void testOneBacteriaCount(int current, int safe)
	{
		System.out.println("For an initial level of " + current + ", it will take " + Week2Functions.howLongUntilSafe(current, safe) +
				" weeks until it reaches level of " + safe + ".");

	}
	public static void testHowLongUntilSafe()
	{
		System.out.println("\n ***** Testing howLongUntilSafe *****");

		testOneBacteriaCount(100, 40);  // this should be 15 weeks
		testOneBacteriaCount(600, 500); // you will need to figure out the correct answer for the rest
		testOneBacteriaCount(50, 17);
		testOneBacteriaCount(1000, 17);		
		testOneBacteriaCount(10000,800);

	}

}
