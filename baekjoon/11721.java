import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] arr = new char[100];
        arr = str.toCharArray();
        
        for(int i=1; i<=arr.length; i++){
        	if(i%10 != 0)
        		System.out.print(arr[i-1]);
        	else
        		System.out.print(arr[i-1]+ "\n");
     	}
	}
}
