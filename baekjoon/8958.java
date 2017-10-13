import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
        char[] arr;
		
		for(int i=0; i<n; i++) {
			String s = sc.next();
			arr = s.toCharArray();
			
			int cnt = 0, sum = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] == 'O')
					cnt += 1;
				else
					cnt = 0;
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}
