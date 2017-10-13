import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        char[] multi = String.valueOf(a*b*c).toCharArray();
		
		for(int i=0; i<multi.length; i++)
			arr[multi[i]-'0'] += 1;
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}
}
