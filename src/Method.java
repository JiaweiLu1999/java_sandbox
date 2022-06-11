public class Method {
	public static void main(String[] args) {
		MyTool tool = new MyTool();
		int[] res = tool.getSumAndSub(1,2);
		System.out.println(res[0] + " " + res[1]);
	}
}

class MyTool {
	public int[] getSumAndSub(int num1, int num2) {
		int sum = num1 + num2;
		int sub = num1 - num2;
		int[] ret = {sum, sub};
		return ret;
	}
}