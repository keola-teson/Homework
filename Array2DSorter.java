package work;

import java.util.Arrays;

public class Array2DSorting
{
	public static void main(String[] args)
	{
		double[][] array2D = createRandomArray(5, 5, 20, 1);
		print(array2D);
		System.out.println();
		
		sortRow(array2D);
		print(array2D);
		System.out.println();
		
		sortColumn(array2D);
		print(array2D);
		
		Arrays.toString(array2D);
	}
	
	/**
	 * creates random 2D array of double
	 * @param height - the amount of arrays stored
	 * @param width - the length of each array stored
	 * @param maximum - the biggest a number can be
	 * @param minimum - the smallest a number can be
	 * @return a new 2D array of doubles
	 */
	private static double[][] createRandomArray(int height, int width, int maximum, int minimum)
	{
		double[][] array2D = new double[height][width]; // creates new empty 2D array
		
		/* generates a random number, moves the decimal point 2 numbers, truncates the number, moves the decimal back */
		for (int i = 0; i < array2D.length; i++)
			for (int j = 0; j < array2D[i].length; j++)
				array2D[i][j] = Math.floor((Math.random() * maximum + minimum) * 100) / 100;
		
		return array2D;
	}
	
	/**
	 * prints the 2D array like:
	 * <p> [num1, num2, num3]
	 * <p> [num4, num5, num6]
	 * <p> [num7, num8, num9]
	 * @param array2D
	 */
	private static void print(double[][] array2D)
	{
		for (double[] array : array2D)
		{
			System.out.print("[");
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i]);
				if (i < array.length - 1)
					System.out.print(", ");
			}
			System.out.println("]");
		}
	}
	
	/**
	 * sorts the passed 2D array row by row using insertion sort
	 * @param array2D
	 */
	public static void sortRow(double[][] array2D)
	{
		for (int r = 0; r < array2D.length; r++) // to move through each row ( used r for less confusion )
		{
			for (int i = 1; i < array2D[r].length; i++)
			{
				for (int j = i; j > 0 && array2D[r][j] < array2D[r][j - 1]; j--) // swaps until number hits correct position
				{
					double temp = array2D[r][j];
					array2D[r][j] = array2D[r][j - 1];
					array2D[r][j - 1] = temp;
				}
			}
		}
	}
	
	/**
	 * sorts the passed 2D array column by column using insertion sort
	 * @param array2D
	 */
	public static void sortColumn(double[][] array2D)
	{
		for (int c = 0; c < array2D[0].length; c++) // to move through each column ( used c for less confusion )
		{
			for (int i = 1; i < array2D.length; i++)
			{
				for (int j = i; j > 0 && array2D[j][c] < array2D[j - 1][c]; j--) // swaps until number hit correct position
				{
					double temp = array2D[j][c];
					array2D[j][c] = array2D[j - 1][c];
					array2D[j - 1][c] = temp;
				}
			}
		}
	}
}
