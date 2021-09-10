package backjun;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		m = m-45;
		if(m<0) {
			m=60+m;
			h=h-1;
			if(h<0) {
				h=23;
			}
		}
		System.out.println(h + " " + m);
	}
}
