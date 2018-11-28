package com.aos.uva.Summing_Digits_11332;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		
		//int totalCase=scan.nextInt();
		String num=scan.next();
		while(!num.equals("0")) {
		   
			while(true) {
				int total=num.chars().map((n)->{
					return Integer.parseInt(((char)n)+"");
				}).sum();
				if(total>=0 && total<=9) {
					System.out.println(total);
					break;
				}
				num=total+"";
			}
			 num=scan.next();
		}
	}

}
