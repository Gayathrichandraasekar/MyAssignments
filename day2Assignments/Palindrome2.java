package week1.day2Assignments;

public class Palindrome2 {
	
	

	public static void main(String[] args) {
		
		int number = 34343;
		int rem;
		int sum=0;
		int number1=number;
		
		for(int i=0; i<=4; i++)
		{
		
		rem=number%10;
		sum = ((sum*10)+rem);
		
		number=number/10;
					
		}
		//System.out.println(sum);
		//System.out.println(number);
		
		if (sum==number1)
		{
			System.out.println(" The Number is Palindrome");
			} 
		else
		{
		System.out.println(" The Number is Not Palindrome");
		}
	
	}
			
		
}
