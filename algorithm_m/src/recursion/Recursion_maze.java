package recursion;

public class Recursion_maze {
	private static final int PATHWAY_COLOR = 0; /*지나갈 수 있는 길*/
	private static final int WALL_COLOR = 1; /*지나갈 수 없는 길*/
	private static final int BLOCKED_COLOR = 2; /*visted지만 출구까지의 길이 없는 길*/
	private static final int PATH_COLOR = 3; /*visited이며 출구로 갈 가능성이 있는 길*/
	
	/*미로 생성*/
	private static int N = 8;
	private static int[][] maze = {
			{0,0,0,0,0,0,0,1},
			{0,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,0,0,1,1,0,0},
			{0,1,1,1,0,0,1,1},
			{0,1,0,0,0,1,0,1},
			{0,0,0,1,0,0,0,1},
			{0,1,1,1,0,1,0,0},
	};
	
	
	/*미로의 길을 찾을 함수 생성*/
	public static boolean findMazePath(int x, int y) {
		return true;
	}
	
	/*미로를 출력할 함수 생성*/
	public static void printMaze() {
		
	}	
	
	public static void main(String[] args) {
		
	}
}