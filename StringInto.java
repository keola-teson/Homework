import java.util.Scanner;
public class StringIntro
{
	public static void main(String[] args)
	{
		//make a scanner for typing in console
		Scanner myReader = new Scanner(System.in);
		
		System.out.println("Input a string: ");
		
		//make an object to read what you inoput
		String myInput = new String(myReader.next());
		
		//make a variable to calculate the input length of the user input
		int inputLength = myInput.length();
		//if statement to check if the length of the input is larger than 6
		if (inputLength <= 6)
		{
			//asks user to input a longer String
			System.out.print("This is not the amount of characters I wanted in your String.");
			System.out.println(" Make it longer than 6 characters.");
		}
		//else statement for if the length of the input is larger than 6
		else
		{
		//prints all the methods in this class
		printSecondAndLastLetter(myInput);
		System.out.println(findTheE(myInput));
		System.out.println(getLength(myInput));
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
		//prints the second and the last letter out
		System.out.println("The second and last letter are: " + "'" + secondLetter + "'" 
		+ " and " + "'" + lastLetter + "'");
	}
	
	/**
	 * method to return where 'e' is.
	 * @param input
	 * @return the index of 'e'
	 */
	public static String findTheE(String input)
	{
		//variable for the .indexOf class to find where 'e' is
		int letterE = input.indexOf('e');
		//if statement to check if there is an 'e' by checking if it returns -1
		if (letterE == -1)
		{
			//return statement to tell the user there is no 'e'
			return "There is no 'e' in your string.";
		}
		//return statement for if there is an 'e'
		return "The index of the letter 'e' is: " + letterE;
	}
	
	/**
	 * method to return the length of the given string
	 * @param input
	 * @return the string length
	 */
	public static String getLength(String input)
	{	
		//returns the length of the inputted string
		return "The length of your string is: " + input.length();
	}
	
	/**
	 * method to print out the first and last three characters in the given string
	 * @param input
	 */
	public static void printFirstAndLastThree(String input)
	{
		
		//finds the legnth of the string
		int inputLength = input.length();
		//gets the first and last three letters of the String using substring
		String firstInputSubstring = new String(input.substring(0, 3));
		String secondInputSubstring = new String(input.substring(inputLength - 3));
		//prints the two string objects out.
		System.out.println("The first three letters of your string is: " + firstInputSubstring);
		System.out.println("The last three letters of your string is: " + secondInputSubstring);
	}
}
