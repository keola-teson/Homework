public class LoopIntroPractice
}

  /**
	 * Counts the amount of times a passed char shows up in a word
	 * @param str (String input)
	 * @param let (char input)
	 * @return the amount of times let shows up in str
	 */
	private static int countLetters(String str, char let)
	{
		//declares a count int variable
		int count = 0;
		
		//loops through the length of the string
		for (int i = 0; i < str.length(); i++)
		{
			/*
			 * checks if the passed char is the same as the 
			 * - if the check is true, adds one to count
			 * - if the check is false, continues the loop
			 */
			if (let == str.charAt(i))
			{
				count++;
			}
		}
		//returns the value in count
		return count;
	}
	

  /**
	 * Multiplies the number passed by n - 1
	 * @param num (int input)
	 * @return the factorial solution of num
	 */
	private static long getFactorial(int num)
	{
		//loops through i until it hits 0
		for(long i = num - 1; i > 0; i--)
		{
			//multiplis num by i
			num *= i;
		}
		//returns the value of num
		return num;
	}
	
	/**
	 * Checks if there is a repeating set of letters next to each other
	 * @param str (String input)
	 * @return true || false
	 */
	private static boolean printIfRepeats(String str)
	{
		//loops through the length of the inputted string
		for (int i = 0; i < str.length(); i++)
		{
			/*
			 * checks if the character the loop is on is the last character
			 * - breaks the loop if true
			 * checks if the character the is no is the same as the one next to it by added 1 to i
			 * - returns true and breaks the loop if true
			 */
			if (str.charAt(i) == str.charAt(str.length() - 1))
			{
				break;
			}
			if (str.charAt(i) == str.charAt(i + 1))
			{
				return true;
			}
		}
		//if the loop is fully iterated through return false as a default
		return false;
	}

}
