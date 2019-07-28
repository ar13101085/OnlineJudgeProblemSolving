package com.aos.uva.Odd_Sum_10783;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		
		int totalCase=scan.nextInt();
		int caseCounter=1;
		
		while(totalCase--!=0) {
			long firstNumber=scan.nextLong();
			long secondNumber=scan.nextLong();
			
			long max=Math.max(firstNumber, secondNumber);
			long min=Math.min(firstNumber, secondNumber);
			
			long sum = LongStream.range(min, max+1).filter(num->num%2==1).sum();
			System.out.println("Case "+caseCounter+++": "+sum);
			
		}
	}

}
