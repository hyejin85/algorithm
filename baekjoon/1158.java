import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int listSize = sc.nextInt();
		int removeIndex = sc.nextInt()-1;
		int currentIndex = 0; 
		
		for(int i=1; i<=listSize; i++)
			list.add(i);
		
		System.out.print("<");
		
		while(!list.isEmpty()) {
			currentIndex += removeIndex;
			
			if(currentIndex >= list.size())
				currentIndex %= list.size();	//-> 핵심
			
			if(list.size() != 1)
				System.out.print(list.remove(currentIndex)+ ", ");
			else
				System.out.print(list.remove(currentIndex));
		}
		
		System.out.print(">");
	}
}
