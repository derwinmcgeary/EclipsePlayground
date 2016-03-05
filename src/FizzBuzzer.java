
public class FizzBuzzer {
	public static void main(String[] args) {
		for(int i=0; i<20;i++) {
			System.out.println(respond(i));
		}
	}

	public static String respond(int n) {
		String response=new String(Integer.toString(n));
		if(n%3 == 0 && n%5 != 0) return "Fizz";
		if(n%3 != 0 && n%5 == 0) return "Buzz";
		if(n%3 == 0 && n%5 == 0) return "FizzBuzz";
		return response;
	}
}
