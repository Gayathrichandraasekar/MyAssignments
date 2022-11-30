package week1.day2Assignments;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int inputrange =8;
	
		int firstno=0;
		int secondno=1;
		int sum;
		System.out.println(firstno);
			
		for (int i=1; i<inputrange-1; i++)
				{
			
			sum=firstno+secondno;
			firstno=secondno;
			secondno = sum;
			System.out.println(sum);
				}
		
				}

	

	
}
