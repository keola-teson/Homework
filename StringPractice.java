//assume circle object and scanner were instantiated elsewhere

/**
 * This method checks for if the user inputted stop and stops the loop
 */
public static void stopMe()
{
	//declares iterations int variable
	int iterations = 0;
	//String to change
	String stopInput = "";
	//checks if the player inputted "stop"
	while (!(stopInput.equalsIgnoreCase("stop")))
	{
		System.out.print("Input text: ");
		//allows player to type
		stopInput = scanner.nextLine();
		//adds one to iterations
		iterations++;
		/*
		 * checks if the user pressed enter
		 * - prints the information and continues the loop skipping everything under it
		 * 
		 * checks if the player only inputted a space
		 * - prints the information and continues the loop skipping everything under it
		 * 
		 * prints the information and continues the loop
		 */
		if (stopInput.length() == 0)
		{
			System.out.println("\nText Inputted: [Nothing]");
			System.out.println("Iteration: " + iterations);
			continue;
		}
		if (stopInput.length() == 1 && stopInput.charAt(0) == ' ')
		{
			System.out.println("\nText Inputted: [Space]");
			System.out.println("Iteration: " + iterations);
			continue;
		}
		System.out.println("Text inputted: \"" + stopInput + "\"");
		System.out.println("Iteration: " + iterations + "\n");
	}
	//prints the amount of times the loop what iterated through
	System.out.println("Iterations: " + iterations);
}

/**
 * This method modifies the radius of the circle object instantiated as a data attribute
 */
public static void changeRadius()
{
	//declares a double with the value of the circle object's radius
	double circleRadius = circle.getRadius();
	/*
	 * loops 5 times
	 * - allows the player to input a number and adds that number to the double variable
	 */
	for (int i = 1; i <= 5; i++)
	{
		System.out.print("Input a number: ");
		double circleInput = scanner.nextDouble();
		
		circleRadius += circleInput;
	}
	//sets radius to the modified value of circleRadius
	circle.setRadius(circleRadius);
	
	//prints the modified circle radius
	System.out.println("Radius of the circle is " + circle.getRadius());
}
