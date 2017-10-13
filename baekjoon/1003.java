import java.util.*;

public class Main {
	private static int cnt0, cnt1;
	
	public static int fibonacci(int n) {
	    if (n == 0) {
	        cnt0++;
	        return 0;
	    } else if (n == 1) {
	    	cnt1++;
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			cnt0 = 0; cnt1 = 0;
			fibonacci(sc.nextInt());
			System.out.println(cnt0+ " " +cnt1);
		}
	}
}

