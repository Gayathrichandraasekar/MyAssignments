package week1.day2Assignments;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] arr= {23,10,45,67,32,89,22};
	
		//int length=arr.length;
		Arrays.sort(arr);
		
		System.out.println("Second Smallest Number inthe arrary is: " + arr[1]);
		

	

	}
}
