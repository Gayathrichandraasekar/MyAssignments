package week1.day2Assignments;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,10};
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length+1;i++) {
			
			if(arr[i-1]!=i) {
				
				System.out.println("The Missing Element in the array is: " + i);
				
			} 
		
		

	}

	}
}
