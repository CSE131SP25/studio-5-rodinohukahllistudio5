package studio5;

import edu.princeton.cs.introcs.StdDraw;

public class Methods {

	int x_1;
	int x_2;
	int y_1;
	int y_2;
	public static double distanceBetween(double x1, double y1, double x2, double y2) {
		double distance = 0;
		// FIXME: Hint use Math methods (e.g. Math.sqrt) to compute the distance
		distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		return distance;
	}

	double X = .5;
	double y = .5;
	double radius = 1;
	
	public static void drawBullsEye(double x, double y, double radius) {
		double radius1 = .5;
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(.5, .5, radius1);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledCircle(.5, .5, radius1*(3.0/4.0));
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(.5, .5, radius1/2);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(.5, .5, radius1/4);
	}

	/**
	 * Return a new String which is the original source String with all occurrences
	 * of the target character substituted by the replacement String.
	 * 
	 * @param source      the source String
	 * @param target      the target character to be replaced
	 * @param replacement the replacement String
	 * 
	 * @return the String which results from substituting all of the target
	 *         characters in the source String with the replacement String
	 */
	public static String substituteAll(String source, char target, String replacement) {
		String result = "";
		// TODO: Finish this method
		
		return result;
	}

	/**
	 * Compute the sum of elements in an array
	 * 
	 * @param values an array of integers
	 * @return the sum of the elements in values
	 */
	public static int arraySum(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	/**
	 * Return an array of a given size filled with the provided value
	 * 
	 * @param length the length of the returned array
	 * @param value  the value to fill the array with
	 * @return and array of size that's filled with value
	 */
	public static int[] filledArray(int length, int value) {
		int[] values = null; // FIXME: Create an array of the appropriate size
		// TODO: Finish this method
		
		

		return values;
	}

	// TODO: Create an arrayMean method which accepts an int array of values parameter.
	// TODO: Create a JavaDoc comment for the arrayMean method.

	
}
