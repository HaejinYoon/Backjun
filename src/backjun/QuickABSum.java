package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class QuickABSum {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bf.readLine()); 
		
		for(int i=1; i<=t; i++) {
			
			int a = Integer.parseInt(bf.readLine()); 
			int b = Integer.parseInt(bf.readLine()); 
			
			bw.write(a+b);
			
			
			
		}
		
		bw.flush();
		
		
	}
}
