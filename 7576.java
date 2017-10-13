import java.util.*;

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	private static int m, n;
	private static int[][] box;
	private static int[] dx = {1, -1, 0, 0};
	private static int[] dy = {0, 0, 1, -1};
	private static Queue<Point> qu = new LinkedList<>();
	
	public static void bfs() {
		int max = 0;
		
		while(!qu.isEmpty()) {
			Point po = qu.remove();
			
			for(int i=0; i<4; i++) {
				int cx = po.x + dx[i];
				int cy = po.y + dy[i];
				
				if(0 <= cx && cx < n && 0 <= cy && cy < m){
					if(box[cx][cy] == 0) {
						box[cx][cy] = box[po.x][po.y] + 1;
						max = box[po.x][po.y];
						qu.add(new Point(cx, cy));
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j] == 0)
					max = -1;
			}
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		box = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				box[i][j] = sc.nextInt();
				
				if(box[i][j] == 1)
                    qu.add(new Point(i, j));
			}
		}
		bfs();
	}
}
