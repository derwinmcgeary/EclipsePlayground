import java.util.Scanner;

public class FizzBuzzer {
	public static void main(String[] args) {
		for (int i = 0; i < 29;i++) {
			System.out.println(respond(readKb()));
		}
	}

	public static String respond(int n) {
		String[] response = {Integer.toString(n),
				"Fizz",
				"Buzz",
				"FizzBuzz"};
		int x = 0;
		
		if (n % 3 == 0) {
			x += 1;
		}
		if (n % 5 == 0) {
			x += 2;
		}
		return response[x];
	}

	// This overloads to allow us to play different versions
	public static String respond(int n, int a, int b) {
		String[] response = {Integer.toString(n),
				"Fizz",
				"Buzz",
				"FizzBuzz"};
		int x = 0;
		
		if (n % a == 0) {
			x += 1;
		}
		if (n % b == 0) {
			x += 2;
		}
		return response[x];
	}
	
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
