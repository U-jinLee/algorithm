package recursion;

public class Recursion_maze {
	private static final int PATHWAY_COLOR = 0; /*지나갈 수 있는 길*/
	private static final int WALL_COLOR = 1; /*지나갈 수 없는 길*/
	private static final int BLOCKED_COLOR = 2; /*visted지만 출구까지의 길이 없는 길*/
	private static final int PATH_COLOR = 3; /*visited이며 출구로 갈 가능성이 있는 길*/
	
	/*미로 생성*/
	private static int N = 8;
	private static int[][] maze = {
		      {0, 0, 0, 0, 0, 0, 0, 1},
		      {0, 1, 1, 0, 1, 1, 0, 1},
		      {0, 0, 0, 1, 0, 0, 0, 1},
		      {0, 1, 0, 0, 1, 1, 0, 0},
		      {0, 1, 1, 1, 0, 0, 1, 1},
		      {0, 1, 0, 0, 0, 1, 0, 1},
		      {0, 0, 0, 1, 0, 0, 0, 1},
		      {0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	
	/*미로의 길을 찾을 함수 생성*/
	public static boolean findMazePath(int x, int y) {
		/*두 좌표가 -의 값을 가지거나 지정된 범위를 초과했을 시*/
		if(x < 0 || y < 0 || x>= N || y >= N) {
			return false;
		} else if(maze[x][y] != PATHWAY_COLOR) { /*'지나갈 수 없는 길'이거나 '출구가 없는 길'일 때*/
			return false;
		} else if (x == N-1 && y == N-1) { /*출구에 도착했을 때*/
			maze[x][y] = PATH_COLOR;
			return true;
		} else {
			maze[x][y] = PATH_COLOR; // 지나온 길은 path_color 처리
			if(findMazePath(x-1, y) || findMazePath(x, y+1) || 
				findMazePath(x+1, y) || findMazePath(x, y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOR;
			return false;
		}
	}
	
	/*미로를 출력할 함수 생성*/
	public static void printMaze() {
		for(int i = 0 ; i < N; i++) {
			System.out.print("{");
			for(int j = 0; j < N; j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println("}");
		}
		System.out.println();
	}	
	
	public static void main(String[] args) {
		printMaze();
		findMazePath(0, 0);
		printMaze();
	}
}