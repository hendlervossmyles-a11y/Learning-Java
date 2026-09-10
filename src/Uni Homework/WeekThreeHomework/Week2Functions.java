package WeekThreeHomework;
public class Week2Functions {

	//********************************
	/*
	 * This function compares an age to the given country's life expectancy.
	 * Only the US and Canada are under consideration.
	 * It is returns "above average","average", or "below average" based on the following:
	 * 
	 * "Canada" :
	 *       age over 84: "above average"
	 *       80-84:  "average"
	 *       less than 80: "below average"
	 *  "US" :
	 *       age over 82: "above average"
	 *       77-82:  "average"
	 *       less than 77: "below average"
	 *  It is assumed that the country parameter is either "US" or "Canada".
	 *  any other value for country should produce a result of "unknown".
	 */

	public static String compareToAverage(String country, int age)
	{
		if (country.equals("US")) {
				if (age > 82)
				return "above average";
				else if (age <= 82 && age >= 77)
					return "average";
				else if (age < 77)
					return "below average";
				else
					return "Issue";
		}
		else if (country.equals("Canada")) {

			if (age > 84)
				return "above average";
				else if (age >= 80 && age <= 84)
					return "average";
				else if (age < 80)
					return "below average";
				else
					return "Issue";

		}
		else
			return "Issue with country";
			
	}
	
	
	//********************************
	/*
	 * This function determines if a tv show was well received based on genre and viewership rating
	 * It is returns "well received" or "not received well" based on the following:
	 * 
	 * genre "Comedy" :
	 *       viewership over 30:    "well received"
	 *       30 or under:  "not received well"
	 *  genre "Horror":
	 *       viewership over 45:    "well received"
	 *       45 or under:  "not received well"
	 *  genre "SuperHero":
	 *       viewership over 70:    "well received"
	 *       70 or under:  "not received well"
	 *  It is assumed that the genre parameter is either "Comedy","Horror" or "SuperHero".
	 *  any other value for genre should produce "no data".
	 */

	public static String getReception(String genre, int viewership)
	{
		if (genre.equals("Comedy")) {
				if (viewership > 30)
				return "well received";
				else
					return "not received well";
		}
		else if (genre.equals("Horror")) {
			if (viewership > 45)
			return "well received";
			else
				return "not received well";
	
	}
		else if (genre.equals("SuperHero")) {
			if (viewership > 70)
			return "well received";
			else {
			return "not received well";
			}}
		else
			return "Error with genre";
	}
		
	
	//********************************
		/*
		 * An orchestra is auditioning trumpet players, oboe players, violin players.  Each
		 * musician submits an audition recording which is scored on the Derkonswar scale.
		 * Musicians who score high enough get to move on to the next round.  If they do not
		 * score high enough, their audition process is done.

		 * "trumpet" requires a score of at least 17 to move on
		 * "oboe" requires a score of at least 19 to move on
		 * "violin" requires a score of at least 27 to move on
		 * 
		 * Return "move on"  or "done" as appropriate for these three instruments.
		 * For any other instrument, return "no openings".
		 */

		public static String doTheyMoveToNextRound(String instrument, int score)
		{
			if (instrument.equals("trumpet")) {
				if (score >= 17)
						return "move on";
				else
					return "done";
			}
			if (instrument.equals("oboe")) {
				if (score >= 19)
						return "move on";
				else
					return "done";
			}
			if (instrument.equals("violin")) {
				if (score >= 27)
						return "move on";
				else
					return "done";
			}
			else
				return "no openings";
				
		}
	
	/**
	 * Imagine a pond with a certain bacteria in it.  The levels are too high.   It is treated with a chemical to bring the
	 * bacteria level down.  This treatment should bring the bacteria level down by 6% each week.
	 * In other words:  if the initial bacteria level is 100, after 1 week, it should be down to 94.  After two weeks, down to
	 * 94 -.06*94 = 88.36
	 * 
	 * This function determines how many weeks until the bacterial level is at or below a safe level.  
	 * 
	 * @param initialLevel  the initial measure of bacteria
	 * @param safeLevel   the level considered to be safe 
	 * @return   the number of weeks until the bacterial level is at or below a safe level. 
	 */
	
	public static int howLongUntilSafe(int initialLevel, int safeLevel) {
		int count = 0;
		double currentLevel = initialLevel;
		while (currentLevel > safeLevel) {
			currentLevel = (currentLevel) - .06 * currentLevel;
			count += 1;
			}
		return count;
	}


}
