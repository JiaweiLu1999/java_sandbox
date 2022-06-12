public class Maze {
	public static void main(String[] args) {

		// initialize map
		int[][] map = new int[8][7];
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for (int i = 0; i < 7; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;

		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }

		// System.out.println();

		T t = new T();
		t.findWay(map, 1, 1);

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}

class T {
	public boolean findWay(int[][] map, int i, int j) {
		if (map[6][5] == 2) {
			return true;
		} else {
			if (map[i][j] == 0) {
				map[i][j] = 2;
				if (findWay(map, i-1, j) || findWay(map, i, j+1) 
					|| findWay(map, i+1, j) || findWay(map, i, j-1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
}