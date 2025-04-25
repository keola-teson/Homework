
public class Array2DSorting
{
	public static void main(String[] args)
	{
		double[][] array2D = createRandomArray(3, 3, 9, 1);
		print(array2D);
		System.out.println();
		
		sortRow(array2D);
		print(array2D);
		System.out.println();
		
		sortColumn(array2D);
		print(array2D);
		System.out.println();
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
				array2D[i][j] = Math.floor((Math.random() * maximum + minimum) * 10) / 10;
		
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
	 * swaps two items in a 2D array
	 * @param array2D - array for swapping
	 * @param array1 - array you want to swap in
	 * @param array2 - array you want to swap in
	 * @param index1 - elem you want to swap
	 * @param index2 - elem you want to swap
	 */
	private static void swap(double[][] array2D, int array1, int array2, int index1, int index2)
	{
		double temp = array2D[array1][index1];
		array2D[array1][index1] = array2D[array2][index2];
		array2D[array2][index2] = temp;
	}
	
	/**
	 * sorts the passed 2D array row by row using bubble sort
	 * @param array2D
	 */
	public static void sortRow(double[][] array2D)
	{
		boolean sorted = false;
		while (!sorted) // loops until array is sorted
		{
			sorted = true;
			
			for (int row = 0; row < array2D.length; row++) // increments rows when current column is fully storted
			{
				int rowCurrent = row; // stores the current iterations of row ( changes later )
				
				for (int column = 0; column < array2D[0].length; column++)
				{
					int rowChange = rowCurrent; // stored for change later
					
					int colChange = column + 1; // stored for error check 
					if (colChange == array2D[0].length && rowChange + 1 < array2D.length) // moves rowChange to next row
					{
						rowChange++;
						colChange = 0;
					}
					
					/* swaps if the current item is bigger than the next item */
					if (colChange < array2D[0].length && array2D[rowCurrent][column] > array2D[rowChange][colChange])
					{
						swap(array2D, rowCurrent, rowChange, column, colChange);
						sorted = false;
					}
					rowCurrent = rowChange; // changed in case the iteration was moved to the next row
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
		boolean sorted = false;
		while (!sorted) // loops until array is sorted
		{
			sorted = true;
			
			for (int column = 0; column < array2D[0].length; column++) // increments column when current row is fully storted
			{
				int colCurrent = column; // stores the current iterations of column ( changes later )
				
				for (int row = 0; row < array2D.length; row++)
				{
					int colChange = colCurrent; // stored for change later
					
					int rowChange = row + 1; // stored for error check 
					if (rowChange == array2D.length && colChange + 1 < array2D[0].length) // moves colChange to next column
					{
						colChange++;
						rowChange = 0;
					}
					
					/* swaps if the current item is bigger than the next item */
					if (rowChange < array2D.length && array2D[row][colCurrent] > array2D[rowChange][colChange])
					{
						swap(array2D, row, rowChange, colCurrent, colChange);
						sorted = false;
					}
					colCurrent = colChange; // changed in case the iteration was moved to the next column
				}
			}
		}
	}
}
