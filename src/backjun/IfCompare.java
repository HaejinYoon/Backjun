package backjun;

import java.util.Scanner;

public class IfCompare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(b>a){
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		scan.close();
	}
}
