public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13, -1, 30, 200, 110};

		for (int k = 0; k < arr.length - 1; k++) {
			for (int i = 0, j = 1; j < arr.length - k; i++, j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}