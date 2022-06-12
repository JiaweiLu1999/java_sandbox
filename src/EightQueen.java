public class EightQueen {
	public static void main(String[] args) {

		int[][] map = new int[8][8];
		T t = new T();
		t.findSol(map, 0);

		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }

		System.out.println(t.num);



	}
}

class T {
	static int num = 0;
	public boolean isAllow(int[][] map, int row, int col) {
		int i, j;

		for (i = 0, j = col; i < row; i++) {
			if (map[i][j] == 1) {
				return false;
			}
		}

		for (i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
			if (map[i][j] == 1) {
				return false;
			}
		}

		for (i = row - 1, j = col + 1; i >= 0 && j < map[0].length; i--, j++) {
			if (map[i][j] == 1) {
				return false;
			}
		}

		return true;
	}

	public void findSol(int[][] map, int row) {
		if (row == map.length) {
			num += 1;
		} else {
			for (int j = 0; j < map.length; j++) {
				if (isAllow(map, row, j)) {
					map[row][j] = 1;

					findSol(map, row + 1);

					map[row][j] = 0;

				}
			}
		}
	}
}