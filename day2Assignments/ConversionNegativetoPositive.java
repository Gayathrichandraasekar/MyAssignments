package week1.day2Assignments;

public class ConversionNegativetoPositive {
	

	public static void main(String[] args) {
		int number=-40;
		int convert;
		if (number<0) {
			System.out.println("negative no="+number);
		}else {
			System.out.println("positivenumber="+number);
		}
        convert=number+(-number*2);
        System.out.println("positivenumber="+convert);
        System.out.println("The number"+ number +"is converted to positive");
	}
	
	}


