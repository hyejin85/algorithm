import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int TC = sc.nextInt();
		int test_case;

		for (test_case = 1; test_case <= TC; test_case++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			boolean[][] visit = new boolean[N][N];
	        
			for (int i=0; i<N; i++) {
                String s = sc.next();
                for (int j=0; j<N; j++) {
                    arr[i][j] = s.charAt(j) - '0';
                }
            }
			
			int x = 0, y = 0, before = 1, cnt = 0;
			
			while(x >= 0 && x < N && y >= 0 && y < N){
				if(arr[x][y] == 1 && visit[x][y] == false) {
					if(before == 1) {
						visit[x][y] = true;
						x--;
						before = 4;
					}else if(before == 2) {
						visit[x][y] = true;
						x++;
						before = 3;
					}else if(before == 3) {
						visit[x][y] = true;
						y--;
						before = 2;
					}else {
						visit[x][y] = true;
						y++;
						before = 1;
					}
					cnt++;
				}else if (arr[x][y] == 2 && visit[x][y] == false) {
					if(before == 1) {
						visit[x][y] = true;
						x++;
						before = 3;
					}else if(before == 2) {
						visit[x][y] = true;
						x--;
						before = 4;
					}else if(before == 3) {
						visit[x][y] = true;
						y++;
						before = 1;
					}else {
						visit[x][y] = true;
						y--;
						before = 2;
					}
					cnt++;
				}else {
					if(before == 1) {
						y++;
					}else if(before == 2) {
						y--;
					}else if(before == 3) {
						x++;
					}else {
						x--;
					}
				}
			}
			
			System.out.println("Case #" + test_case);
			System.out.println(cnt);
		}
	}
}
