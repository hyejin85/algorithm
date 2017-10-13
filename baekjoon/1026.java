import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i=0; i<N; i++)
			A[i] = sc.nextInt();
		
		for(int i=0; i<N; i++)
			B[i] = sc.nextInt();
		
		int[] tempArr = B;
		Arrays.sort(tempArr);
		
		for(int i=N; i>0; i--) {
			for(int j=0; j<N-1; j++) {
				if(A[j] < A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		
		int S = 0;
		for(int i=0; i<N; i++)
			S += A[i] * tempArr[i];
		
		System.out.println(S);
	}
}

