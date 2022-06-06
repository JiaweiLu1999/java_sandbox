import java.util.Scanner;
public class ArrayExercise {
	public static void main(String[] args) {
		// 01
		int[] arr1 = {10, 12, 45, 90};
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Input a number: ");
		int num = myScanner.nextInt();

		int[] arr2 = new int[arr1.length + 1];
		int i = 0;
		for (; i < arr1.length; i++) {
			if (arr1[i] < num) {
				arr2[i] = arr1[i];
			} else {
				break;
			}
		}
		arr2[i++] = num;

		for (; i < arr2.length; i++) {
			arr2[i] = arr1[i-1];
		}

		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j] + " ");
		}
		System.out.println();


		// 02
		int[] arr3 = new int[10];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (int)(Math.random()*100 + 1);
		}


	}
}