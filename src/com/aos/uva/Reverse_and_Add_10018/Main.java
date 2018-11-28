package com.aos.uva.Reverse_and_Add_10018;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		
		int totalCase=scan.nextInt();
		
		while(totalCase--!=0) {
			String num=scan.next();
			for (int i = 0;; i++) {
				
				StringBuffer sb=new StringBuffer(num);
				String reverseString=sb.reverse().toString();
				
				if(reverseString.equals(num)) {
					System.out.println(i+" "+num);
					break;
				}
				
				long firstNumber=Long.parseLong(num);
				long secondNumber=Long.parseLong(reverseString);
				
				num=(firstNumber+secondNumber)+"";
			}
			
		}
	}

}
