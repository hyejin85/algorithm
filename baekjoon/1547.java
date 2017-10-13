import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {0, 1, 0, 0};
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 1)
				System.out.println(i);
		}
	}
}
