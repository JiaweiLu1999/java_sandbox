import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Input your name:");
		String name = inputScanner.next();

		System.out.println("Input your age:");
		int age = inputScanner.nextInt();

		System.out.println("Input your salary:");
		double salary = inputScanner.nextDouble();

		System.out.println("[Info]: Name:" + name + "\tAge:" + age + "\tSalary:" + salary);
	}
}