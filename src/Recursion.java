public class Recursion {
	public static void main(String[] args) {
		Tool myTool = new Tool();
		System.out.println(myTool.getNum(10));
	}
}

class Tool {
	public int fib(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}

	public int getNum(int numDay) {
		if (numDay == 1) {
			return 1;
		} else {
			return 2 * (getNum(numDay - 1) + 1);
		}
	}
}