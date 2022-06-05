import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Input your grade:");
		double grade = myScanner.nextDouble();

		System.out.println("Input your gender:");
		String gender = myScanner.next();

		if (grade > 8.0) {
			System.out.println("Go to Final!");

			if (gender.equals("Male")) {
				System.out.println("Go to Male!");
			} else {
				System.out.println("Go to Female!");
			}
		} else {
			System.out.println("Out!");
		}
	}
}