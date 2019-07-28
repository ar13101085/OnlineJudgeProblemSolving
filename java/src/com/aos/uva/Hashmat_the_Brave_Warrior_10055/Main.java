package com.aos.uva.Hashmat_the_Brave_Warrior_10055;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		
		while(scan.hasNext()) {
			long firstNumber=scan.nextLong();
			long secondNumber=scan.nextLong();
			
			System.out.println(Math.abs(firstNumber-secondNumber));
			
		}
	}

}
