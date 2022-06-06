import java.util.Scanner;
public class ArrayTest {
	public static void main(String[] args) {
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		double totalWeight = 0;
		for (int i = 0; i < hens.length; i++) {
			totalWeight += hens[i];
			System.out.println("Weight of the " + i + " hen is:" + hens[i]);
		}
		System.out.println("The total weight is " + totalWeight);
		System.out.println("The average weight is " + totalWeight/hens.length);

		double[] scores = new double[5];
		Scanner myScanner = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Input the " + i + " score:");
			scores[i] = myScanner.nextDouble();
		}


		for (int i = 0; i < scores.length; i++) {
			System.out.println("score "+ i + ": " + scores[i]);
		}

		String[] arr1 = new String[4];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		char[] arr2 = new char[26];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (char) ('A' + i);
		}
		System.out.println(arr2);

		char[] arr3 = arr2.clone();
		arr2[0] = 'Z';
		System.out.println(arr2);
		System.out.println(arr3);


	}
}