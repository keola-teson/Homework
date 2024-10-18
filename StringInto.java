import java.util.Scanner;
/**
 * This class was made for an assignment about Strings
 * user inputs a word and it prints random facts about that word
 * @author Keola Teson :)
 */
public class StringIntro
{
	public static void main(String[] args)
	{
		//make a scanner for typing in console
		Scanner myReader = new Scanner(System.in);
		
		System.out.println("Input a string: ");
		
		//make an object to read what you inoput
		String myInput = new String(myReader.nextLine());
		
		
		/*
		 * tests if the input is a desired length or word
		 * if the input is someone i sit with in compsci or mr trauger, print all the methods below
		 * if the input is less than or equal to 6, tell the user to reprint something longer
		 * if every check fails, print every method except for easter egg method
		 */
		int inputLength = myInput.length();
		if (myInput.equalsIgnoreCase("Daniel") || myInput.equalsIgnoreCase("Ella")
				|| myInput.equalsIgnoreCase("Amber") || myInput.equalsIgnoreCase("Trauger"))
		{
			printSecondAndLastLetter(myInput);
			System.out.println(findTheE(myInput));
			System.out.println(getLength(myInput));
			printFirstAndLastThree(myInput);
			//easter egg
			System.out.println(forPeopleIKnow(myInput));
		}
		else if (inputLength <= 6)
		{
			System.out.print("This is not the amount of characters I wanted in your String.");
			System.out.println(" Make it longer than 6 characters.");
		}
		else
		{
			/*
			 * prints the printSecondAndLastLetter method
			 * then checks if the findTheE output == -1 (if there is not an 'e' in this string)
			 * if that check fails it prints out where the 'e' is in the string
			 * then prints the remaining methods that are needed for this assignment
			 */
			printSecondAndLastLetter(myInput);
			if (findTheE(myInput) == -1)
			{
				System.out.println("There is no 'e' in this string.");
				
			}
			else
			{
				System.out.println("The index of 'e' in this string is: " + findTheE(myInput));
			}
			System.out.println("The length of string is: " + getLength(myInput));
			printFirstAndLastThree(myInput);
		}
			
		//close scanner
		myReader.close();
	}
	
	/**
	 * method to print the second and last letter of the user's input
	 * @param input
	 */
	public static void printSecondAndLastLetter(String input)
	{
		//finds the second the last character in the string
		char secondLetter = input.charAt(1);
		char lastLetter = input.charAt(input.length() - 1);
		
		//used in the if statements below
		String firstSpace = "[space]";
		/*
		 * creates a new string variable to call the .substring method to only return the first two characters
		 * checks if the index of ' ' not -1 (it is in the string the user inputted)
		 * - if it is true, create a string using .substring to return the last character in the string
		 * - checks if the last character is ' '
		 *   - if it is true, create a string with the value "[space]"
		 *     - prints out a modified version of the final print statement with both ' ' being replaced with "[space]"
		 *   - if the check is false, returns a modified version of the final print statement with only one ' ' being
		 *   replaced with "[space]"
		 * - if the check is false, print the second and last letter of the inputted string
		 */
		String toSecondLetter = input.substring(0, 2);
		if (toSecondLetter.indexOf(' ') != -1)
		{
			String everythingPastSpace = input.substring(input.length() - 1);
			if (everythingPastSpace.indexOf(' ') != -1)
			{
				String secondSpace = "[space]";
				System.out.println("The second and last letter are: " + "'" + firstSpace + "'" 
						+ " and " + "'" + secondSpace + "'");
			}
			else
			{
				System.out.println("The second and last letter are: " + "'" + firstSpace + "'" 
						+ " and " + "'" + lastLetter + "'");
			}
		}
		else
		{
			//prints the second and the last letter out
			System.out.println("The second and last letter are: " + "'" + secondLetter + "'" 
					+ " and " + "'" + lastLetter + "'");
		}
	}
	
	/**
	 * method to return where 'e' is.
	 * @param input
	 * @return the index of 'e'
	 */
	public static int findTheE(String input)
	{
		//returns the index number of 'e' in the inputted string
		return input.indexOf('e');
	}
	
	/**
	 * method to return the length of the given string
	 * @param input
	 * @return the string length
	 */
	public static int getLength(String input)
	{	
		//returns the length of the inputted string
		return input.length();
	}
	
	/**
	 * method to print out the first and last three characters in the given string
	 * @param input
	 */
	public static void printFirstAndLastThree(String input)
	{
		
		//gets the first and last three letters of the String using substring
		String firstInputSubstring = new String(input.substring(0, 3));
		String secondInputSubstring = new String(input.substring(input.length() - 3));
		//prints the two string objects out.
		System.out.println("The first three letters of your string is: " + firstInputSubstring);
		System.out.println("The last three letters of your string is: " + secondInputSubstring);
	}
	
	/**
	 * this is an easter egg method. not important or required. just for fun.
	 * @param name
	 * @return "Hello Daniel. Stop snooping in my code."; "Hello Ella. Lyzelle is mine.";
	 *  "Hello Amber. I didn't do anything this time fo sho."; "Can I get extra credit on this please :)"
	 */
	public static String forPeopleIKnow(String name)
	{
		/*
		 * tests whether or not the Strings "Daniel", "Ella", "Amber", or "Trauger" is inputted
		 * returns nothing if not
		 */
		if (name.equalsIgnoreCase("Daniel"))
		{
			return "Hello Daniel. Stop snooping in my code.";
		}
		if (name.equalsIgnoreCase("Ella"))
		{
			return "Hello Ella. Lyzelle is mine.";
		}
		if (name.equalsIgnoreCase("Amber"))
		{
			return "Hello Amber. I didn't do anything this time fo sho.";
		}
		if (name.equalsIgnoreCase("Trauger"))
		{
			return "Can I get extra credit on this please :)";
		}
		//if all checks fail, return nothing (used "" as a placeholder so there is no error")
		return "";
	}
}
