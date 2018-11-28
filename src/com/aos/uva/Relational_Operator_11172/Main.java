package com.aos.uva.Relational_Operator_11172;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		
		int totalCase=scan.nextInt();
		
		while(totalCase--!=0) {
			long firstNumber=scan.nextLong();
			long secondNumber=scan.nextLong();
			
			if(firstNumber>secondNumber) {
				System.out.println(">");
			}else if(firstNumber<secondNumber) {
				System.out.println("<");
			}else {
				System.out.println("=");
			}
		}
	}

}
