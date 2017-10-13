import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		s = s.trim();
		int cnt = 0;
		boolean flag = false;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				if(s.charAt(i-1) != ' ')
					cnt++;
			} else {
				flag = true;
			}
		}
		
		if(flag)
			System.out.println(cnt+1);
		else
			System.out.println(cnt);
	}
}
