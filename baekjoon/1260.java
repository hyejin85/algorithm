import java.util.*;

public class Main {
	static int N, M, V;
	static int v1, v2;
	static int[][] vertex;
	static boolean[] visited;
		
	public static void dfs(int V){
		System.out.print(V+ " ");
		visited[V] = true;
		
		for(int i=1; i<N+1; i++) {
			if(vertex[V][i] == 1 && !visited[i]) {
				dfs(i);
			}
		}
	}
	
	public static void bfs(int V){
		Queue<Integer> queue = new LinkedList<>();
		queue.add(V);
		visited[V] = true;
		
		while (!queue.isEmpty()) {
			int vRemove = queue.remove();
			System.out.print(vRemove+ " ");
				
			for(int i=1; i<N+1; i++) {
				if(vertex[vRemove][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		V = scanner.nextInt();
        
		vertex = new int[N+1][N+1];
        
        for(int i=0; i<M; i++) {
        	v1 = scanner.nextInt();
        	v2 = scanner.nextInt();
        	vertex[v1][v2] = vertex[v2][v1] = 1;
        }
        
        visited = new boolean[N+1];
        dfs(V);
        
        System.out.println();
        
        visited = new boolean[N+1];
        bfs(V);
	}
}
