import java.security.KeyStore;
import java.util.Locale;

public class Week3functions {

	/**
	 * For a certain membership organization, history shows that 11% of its members do not renew
	 * in a given year.  History also shows that 47 new members join the organization each year.
	 * In other words, if the initial membership is 100, after one year, the membership is
	 * 100 - 11% of 100 + 47 = 100 - 11 + 47 = 136.
	 * At the end of year 2:
	 * 136 - 11% of 136 + 47 = 136 - 14 + 47  = 169
	 * NOTE:  11% of 136 is 14.96, and this was rounded DOWN to 14.

	 * 
	 * This function determines a projected membership size given a starting membership size and 
	 * a number of years. 
	 * 
	 * @param membership  the initial number of members
	 * @param years   the number of years to project into the future
	 * @return   the projected number  of members after that many years.
	 */
	
	public static int projectedMembership(int membership, int years) {
		double newMembership = membership;
		for( int i = 0; i < years; i++) {
			newMembership = (newMembership - newMembership*.11) + 47;
		}
		return (int) newMembership;
    }

	/**
	 * A strand of DNA is represented by the characters A,C,T, and G.  The "Jacox" metric is the total 
	 * number of C's and G's in the strand. 
	 * EG  “ATCGCCTTAACA”  should result in 5
	 * @param oneStrand
	 * @return the jacox metric
	 */
	public static int jacoxMetric(String oneStrand) {
		int charCount = 0;
		oneStrand = oneStrand.toLowerCase();
		for(int i = 0; i < oneStrand.length(); i++ ) {
			if(oneStrand.charAt(i) == 'c' )
				charCount ++;
			else if(oneStrand.charAt(i) == 'g')
				charCount ++;

			else
				continue;

            }
		return charCount;

	}
	
	
	
	/**
	 * A strand of DNA is represented by the characters A,C,T, and G.   For this function, a "skewed" strand is
	 * one that has more A's than T's.    
	 * EG  “ATCGCCTTAACA”  should result in true
	 * @param oneStrand
	 * @return true if there are more A's than T's.  false otherwise
	 */
	public static boolean skewed(String oneStrand) {
		int aCount = 0;
		int tCount = 0;
		oneStrand = oneStrand.toLowerCase();
		for(int i = 0; i<oneStrand.length(); i++) {
			if (oneStrand.charAt(i) == 'a')
				aCount++;
			else if (oneStrand.charAt(i) == 't')
				tCount++;
			else
				continue;
		}
		if(aCount > tCount)
			return true;
		else
			return false;
	}
	
	/**
	 * A strand of DNA is represented by the characters A,C,T, and G.  
	 * Given two DNA strands, if they are placed next to each other, can they bind?
	 * A's and T's can bind to each other and C's and G's can bind to each other.  
	 * Chars cannot bind to themselves.
	 * Each spot must bind in the other strand.  If any spot does not bind, then the answer
	 * is false.
	 * If the strands are of different lengths, then the answer is automatically false.
	 * EG:  ATCG  and TAGC  should result in true.
	 *      ATCG  and ACCG  should result in false.
	 *      ACCGTTA and  TGGCA should result in false.
	 *      ACCGTTA and TGGCAAT  should result in true.
	 */
	public static boolean bind(String strand1, String strand2) {
		if(strand1.length() != strand2.length())
			return false;
		int aCount = 0;
		int cCount = 0;
		int tCount = 0;
		int gCount = 0;

		int aCount2 = 0;
		int cCount2 = 0;
		int tCount2 = 0;
		int gCount2 = 0;

		for(int i = 0;  i< strand1.length(); i++) {
			if( strand1.charAt(1) == 'a')
				aCount ++;
			else if( strand1.charAt(1) == 'c')
				cCount ++;
			else if( strand1.charAt(1) == 't')
				tCount ++;
			else if( strand1.charAt(1) == 'g')
				gCount ++;
		}
		for(int i = 0;  i< strand2.length(); i++) {
			if( strand1.charAt(1) == 'a')
				aCount2 ++;
			else if( strand1.charAt(1) == 'c')
				cCount2 ++;
			else if( strand1.charAt(1) == 't')
				tCount2 ++;
			else if( strand1.charAt(1) == 'g')
				gCount2 ++;
		}
		if (aCount != aCount2 || cCount != cCount2 || tCount != tCount2 || gCount != gCount2)
			return false;
		else
			return true;
	}
	/**
	 * This function counts the number of pseudo-vowels in a word.    A "pseudo-vowel" is defined 
	 * as the letters a,e,i,o, and u,  both upper and lower case.  Also the letter y (upper and lower
	 * case) if there are no other vowels in the word or if it is preceded by another vowel.
	 * EG:  "apple"  should return 2
	 * 		"PAYDAY"  should return 4
	 *      "sly" should return 1
	 *      "turkey" should return 3
	 *      "psych" should return 1
	 * ASSUMES: the parameter is only one word.  Only English characters, and no space or other 
	 * punctuation.
	 */
	public static int countPseudoVowels(String word)
	{
		return -100;
	}
}

void main() {
}
