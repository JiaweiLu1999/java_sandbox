import java.util.Scanner;
public class ExerciseControl {
	public static void main(String[] args) {
		// 01
		int money = 100000;
		int cnt = 0;
		while (money > 0) {
			if (money > 50000) {
				money -= (int) money*0.05;
			} else if (money >= 1000) {
				money -= 1000;
			} else {
				break;
			}
			cnt += 1;
		}
		System.out.println(cnt);

		// 02
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Input a number with 3 digits:");
		int num = myScanner.nextInt();

		int d0, d1, d2;
		d0 = num%10;
		d1 = num/10%10;
		d2 = num/100;

		if (num == d0*d0*d0 + d1*d1*d1 + d2*d2*d2) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}

		// 03
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%5 != 0) {
				System.out.print(i + "\t");
				count++;
			}

			if (count%5 == 0) {
				System.out.println();
			}
		}

		// 04
		int n1 = (int) 'a';
		int n2 = (int) 'Z';
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (n1+i));
		}
		System.out.println();
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (n2-i));
		}
		System.out.println();

		for (char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1);
		}
		System.out.println();
		for (char c2 = 'Z'; c2 >= 'A'; c2--) {
			System.out.print(c2);
		}
		System.out.println();

		// 05
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 1) {
				sum += 1.0/i;
			} else {
				sum -= 1.0/i;
			}
		}
		System.out.println(sum);

		// 06
		int ret = 0;
		int sum1 = 0;
		for (int i = 1; i <= 100; i++) {
			sum1 += i;
			ret += sum1;
		}
		System.out.println(ret);
	}
}