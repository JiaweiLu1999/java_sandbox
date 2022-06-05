public class TenaryOperator {
	public static void main(String[] args) {
		int a = 1000, b = 21, c = 150;

		// return the max of three numbers
		int ret = a > b ? a > c ? a : c : b > c ? b : c;
		System.out.println(ret);
	}
}