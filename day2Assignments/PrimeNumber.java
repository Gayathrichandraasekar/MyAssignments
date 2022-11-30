package week1.day2Assignments;

public class PrimeNumber {
	

	public static void main(String[] args) {
		int input=12;
		Boolean flag = false;
	int mu=input/2;
	
		for(int i=2;i<=mu;i++)
			{
				if(input%i==0)
					{
						
					flag = true;
					System.out.println("The flag is"+ flag);
					System.out.println("The Number is Not Prime" + input);
					break;
					}
				else
					{
					flag = false;
					System.out.println("The flag is"+ flag);
					System.out.println("The Number is  Prime" + input);
					break;
					}
			}
		
	}
		}

	


