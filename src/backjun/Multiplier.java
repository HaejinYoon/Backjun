package backjun;

import java.util.Scanner;

public class Multiplier {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int b = scan.nextInt();
		
		System.out.println(a*(b%10));
		
		System.out.println(a*(((b-(b%10))%100))/10);
		
		System.out.println(a*(b/100));
		
		System.out.println(a*b);
		
		scan.close();
	}
}
