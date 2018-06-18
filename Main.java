//This program contains the definitions of 5 different methods.
public class Main {
	
	public static void main(String[] args) {
		/* TEST CODES
		smallest(-1.1, 2.3, 6.7); 
		largest(-1.1, 2.3, 6.7); 
		average(1.1, 1.2, 1.3);
		allTheSame(1.0, 2.0, 1.0);
		allTheSame(1.0, 1.0, 1.0);
		allDifferent(1.0, 2.0, 1.0);
		allDifferent(2.1, -1.7, 5.6);
		*/
	}

	public static void smallest(double a, double b, double c) {
		final int ARRAY_NUM = 3;
		double[] numbers = {a, b, c};
		double min;
		min = numbers[0];
		for (int i = 1; i < ARRAY_NUM; ++i) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		//System.out.println(min); (for testing)
	}
	
	public static void largest(double a, double b, double c) {
		final int ARRAY_NUM = 3;
		double[] numbers = {a, b, c};
		double max;
		max = numbers[0];
		for (int i = 1; i < ARRAY_NUM; ++i) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		//System.out.println(max); (for testing)
	}
	
	public static void average(double a, double b, double c) {
		final int AVERAGE_DIVISOR = 3;
		double avg;
		avg = (a + b + c) / AVERAGE_DIVISOR;
		//System.out.println(avg); (for testing)
	}
	
	public static void allTheSame(double a, double b, double c) {
		String answer;
		if (a == b) {
			if (b == c) {
				answer = "True";
			}
			else {
				answer = "False";
			}
		}
		else {
			answer = "False";
		}
		//System.out.println(answer); (for testing)
	}
	
	public static void allDifferent(double a, double b, double c) {
		String answer;
		if (a != b) {
			if (b != c ) {
				if (a != c) {
					answer = "True";
				}
				else {
					answer = "False";
				}
			}
			else {
				answer = "False";
			}
		}
		else {
			answer = "False";
		}
		//System.out.println(answer); (for testing)
	}
}