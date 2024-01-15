public class MazeProblem {

	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0 },
				{ 1, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 0 } };

		if (solveMaze(0, 0, maze, maze.length, maze[0].length)) {
			System.out.println("Yeeye!!! there is a path");
		} else {
			System.out.println("Their is no path.");
		}

	}

	private static boolean solveMaze(int i, int j, int[][] maze, int n, int m) {

		// terminating conditions
		if (i >= n || j >= m || i < 0 || j < 0) {
			return false;
		}

		// check if we finished or we got the solution
		if (i == n - 1 && j == m - 1) {
			return true;
		}

		// if current position is blocked or not
		if (maze[i][j] == 2 || maze[i][j] == 1) {
			return false;
		}

		// mark it as traversed
		maze[i][j] = 2;

		// will check down and right direction, if we got the solution return true
		if (solveMaze(i + 1, j, maze, n, m) || solveMaze(i, j + 1, maze, n, m)) {
			return true;
		}
		// unmark the position

		maze[i][j] = 0;
		// return false
		return false;
	}

}
