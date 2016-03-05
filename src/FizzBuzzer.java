import java.util.Scanner;

/*
 * This is yet another go at doing FizzBuzz, third technique so far
 * There is a reader from stdin, and a responder which will return
 * a) The number
 * b) Fizz if the number is a multiple of fizzDivisor
 * c) Buzz if a multiple of buzzDivisor
 * d) FizzBuzz if both
 */
public class FizzBuzzer {
	
	public static void main(String[] args) {
		for (int i = 0; i < 29;i++) {
			System.out.println(respond(readKb()));
		}
	}
	
/*	
 * 	Returns the appropriate string (input value, "Fizz", "Buzz", or "FizzBuzz")
 *  based on divisibility by fizzDivisor and buzzDivisor	
 */	
	public static String respond(int input, int fizzDivisor, int buzzDivisor) {
		String[] response = {Integer.toString(input),
							"Fizz",
							"Buzz",
							"FizzBuzz"};
		int x = 0;
		
		if (input % fizzDivisor == 0) {
			x += 1;
		}
		if (input % buzzDivisor == 0) {
			x += 2;
		}
		return response[x];
	}
/*
 * Standard FizzBuzz, if no divisors are specified
 */
	public static String respond(int input) {
		// This is the default, so we pass it through to
		// the more generalised method
		return respond(input,3,5);
	}
/*
 * Gets and returns integers from stdin
 */
	public static int readKb() {
		int out = -1;
		Scanner s = new Scanner(System.in);
		
		try {
			if(s.hasNextInt()) {
				out=s.nextInt();
			}
		} catch (Exception IllegalStateException) {
			System.out.println("Looks like stdin is dead to us!");
		}
		
		return out;		
	}
}
