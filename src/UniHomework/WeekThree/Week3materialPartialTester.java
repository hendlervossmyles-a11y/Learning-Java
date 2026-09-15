
public class Week3materialPartialTester {

	public static void main(String[] args) {

		System.out.println("    !!!!! This program runs some tests on the Week3Functions. !!!!");
		System.out.println("    !!!!! This tester is not complete, and you are encouraged to modify it.!!!!");

		testProjectMembership();
		testJacox();
		testSkewed();
		testBind();
		testCountPseudoVowels();
	}


	//*********************************
	public static void testOneProjectedMembership(int initial, int years)
	{
		System.out.println("For an initial count of " + initial + ", after " + years 
				+ " years, the projected count is: " 
				+ Week3functions.projectedMembership(initial, years));


	}
	public static void testProjectMembership()
	{
		System.out.println("\n ***** Testing projectMemership *****");

		testOneProjectedMembership(100,2);  
		testOneProjectedMembership(100,3);
		testOneProjectedMembership(100,4);
		testOneProjectedMembership(500,2);		
		testOneProjectedMembership(500,3);
		testOneProjectedMembership(500,5);

	}
	
    //*********************************
	public static void testOneJacox(String strand)
	{
		System.out.println("The Jacox metric of " + strand + " is " + Week3functions.jacoxMetric(strand) );


	}
	public static void testJacox()
	{
		System.out.println("\n ***** Testing jacoxMetric *****");

		String [] strands = {"ATCGCCTTAACA","CCCCCGGGGG","CATTTCAAGCC","C","AT","ATATATAAA"};
		for (String s:strands)
			testOneJacox(s);
	}
	
    //*********************************
	public static void testOneSkewed(String strand)
	{
		if (Week3functions.skewed(strand))
			System.out.println(strand + " is determined to be skewed.");
		else
			System.out.println(strand + " is determined to be NOT skewed.");
	}
	public static void testSkewed()
	{
		System.out.println("\n ***** Testing skewed *****");

		String [] strands = {"ATCGCCTTAACA","CCCCCGGGGG","CATTTCAAGCC","C","AT","ATATATAAA"};
		for (String s:strands)
			testOneSkewed(s);
	}
	
    //*********************************
	public static void testOneBind(String strand1, String strand2)
	{
		System.out.print(strand1 + " and " + strand2 + " are determined to ");
		if (Week3functions.bind(strand1,strand2))
			System.out.println("BIND");
		else
			System.out.println("NOT BIND");
	}
	public static void testBind()
	{
		System.out.println("\n ***** Testing bind *****");

		String [] strandsOne = {"ATCG","CCCCGGGG","ATCGA","C","C","",   "ACCGTACGT"};
		String [] strandsTwo = {"TAGC","GGGGCCCC","TAGC","G","A","ATCG","TGGTATGCA"};
		for (int pos = 0; pos < strandsOne.length;++pos)
			testOneBind(strandsOne[pos],strandsTwo[pos]);
	}
	
	
    public static void testCountPseudoVowels() {
		System.out.println("\n ***** Testing PseudoVowels *****");
    	String [] tests = {"apple","APPLE","turkey","SLY","PAYDAY","psych","adieu","BAYOU"};
    	for (String onetest: tests)
    	{
    		int answer = Week3functions.countPseudoVowels(onetest);
    		System.out.println("\"" + onetest + "\" has " + answer + "v owels.");
    	}
		
	}

}
