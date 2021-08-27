package BFS;

public class bfs_basic {
	//임의의 가상 그래프 생성
	/*0~8번까지 노드이며 각 노드가 어떤 노드와 연결돼 있는지를 의미.*/
					/*0번은 제외*/
	public static void main(String[] args) {
							/*1번은 2, 3, 8 노드와 연결 이런식으로 생겨먹었다..*/
		int graph[][] = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		/*방문 처리를 하기 위한 boolean 배열*/
		boolean[] visited = new boolean[9];
		
		System.out.println(bfs(1, graph, visited));
	}
	/*bfs 메소드 생성*/
	public static String bfs(int startNode, int[][] graph, boolean[] visited) {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.toString();
	}
}