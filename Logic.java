public class Logic {
	
	public static char[][] pos = new char[3][3];
	public static char turn = 'x';
	
	public static void setBoard(int newX, int newY) {
		try {
			if (turn == 'x' && pos[newX][newY] == 0) {
				pos[newX][newY] = 'x';
				turn = 'o';
			} else if (turn == 'o' && pos[newX][newY] == 0) {
				pos[newX][newY] = 'o';
				turn = 'x';
			}
		} catch (IndexOutOfBoundsException e) {
			;
		}
	}
	
	public static char checkBoard() {
		
		boolean isFull = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (pos[i][j] == 0) {
					isFull = false;
				}
			}
		}
		
		if (pos[0][0] == 'x' && pos[0][1] == 'x' && pos[0][2] == 'x') {
			return 'x';
		} else if (pos[1][0] == 'x' && pos[1][1] == 'x' && pos[1][2] == 'x') {
			return 'x';
		} else if (pos[2][0] == 'x' && pos[2][1] == 'x' && pos[2][2] == 'x') {
			return 'x';
		} else if (pos[0][0] == 'x' && pos[1][0] == 'x' && pos[2][0] == 'x') {
			return 'x';
		} else if (pos[0][1] == 'x' && pos[1][1] == 'x' && pos[2][1] == 'x') {
			return 'x';
		} else if (pos[0][2] == 'x' && pos[1][2] == 'x' && pos[2][2] == 'x') {
			return 'x';
		} else if (pos[0][0] == 'x' && pos[1][1] == 'x' && pos[2][2] == 'x') {
			return 'x';
		} else if (pos[0][2] == 'x' && pos[1][1] == 'x' && pos[2][0] == 'x') {
			return 'x';
		} else if (pos[0][0] == 'o' && pos[0][1] == 'o' && pos[0][2] == 'o') {
			return 'o';
		} else if (pos[1][0] == 'o' && pos[1][1] == 'o' && pos[1][2] == 'o') {
			return 'o';
		} else if (pos[2][0] == 'o' && pos[2][1] == 'o' && pos[2][2] == 'o') {
			return 'o';
		} else if (pos[0][0] == 'o' && pos[1][0] == 'o' && pos[2][0] == 'o') {
			return 'o';
		} else if (pos[0][1] == 'o' && pos[1][1] == 'o' && pos[2][1] == 'o') {
			return 'o';
		} else if (pos[0][2] == 'o' && pos[1][2] == 'o' && pos[2][2] == 'o') {
			return 'o';
		} else if (pos[0][0] == 'o' && pos[1][1] == 'o' && pos[2][2] == 'o') {
			return 'o';
		} else if (pos[0][2] == 'o' && pos[1][1] == 'o' && pos[2][0] == 'o') {
			return 'o';
		} else if (isFull == true) {
			return 'f';
		} else {
			return 'e';
		}
	}
}