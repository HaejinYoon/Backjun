package backjun;

import java.util.Scanner;

public class LunarYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a%4==0) {
			if(a%100 != 0 | a%400 == 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
		System.out.println("0");
		}
		
		scan.close();
	}
}
