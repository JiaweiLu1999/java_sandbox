import java.util.Scanner;
public class Star {
	public static void main(String[] args) {
		Scanner myScanner  = new Scanner(System.in);
		int height, width, mid;

		System.out.println("Input the height of the pyramid: ");
		height = myScanner.nextInt();
		width = height*2 - 1;
		mid = height - 1;


		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == mid - i || j == mid + i || i == height - 1) {
				System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}
}