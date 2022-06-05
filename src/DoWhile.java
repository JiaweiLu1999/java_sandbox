import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		int cnt = 0;

		do {
			if (i % 5 == 0 && i % 3 != 0)
				cnt++;
			i++;
		} while (i <= 200);

		System.out.println(cnt);

		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("Bang Bang Bang...");
			System.out.println("Returen money? [y/n]");
			answer = myScanner.next().charAt(0);
			System.out.println();
				
		} while (answer != 'y');
	}
}