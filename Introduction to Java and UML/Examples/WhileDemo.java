public class WhileDemo {
	public static void main(String args[]) {
		int a = 5, fact = 1;
		while (a >= 1) {
			fact *= a;
			a--;
		}
		System.out.println("The Factorial of 5 is " + fact);
	}
}
