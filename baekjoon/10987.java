import java.util.Scanner;

class Aeiou {
	
	public void setInfo() {
        Scanner sc = new Scanner(System.in);
        char[] arr;
        String ch = sc.nextLine();
        arr = ch.toCharArray();
       
        checkInfo(arr);
    }
	
	public void checkInfo(char[] arr){
		int count = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
				count++;
		}
		System.out.println(count);
	}
}

public class Main{
	public static void main(String[] args) {
		Aeiou a = new Aeiou();
		a.setInfo();
	}

}
