package week1.day2Assignments;

public class FindIntersection {

	public static void main(String[] args) {
	int[] value1={3,2,11,4,6,7};
	int[] value2= {1,2,8,4,9,7};
	int length1=value1.length;
	int length2=value2.length;
	for(int i=0;i<length1;i++) {
		for(int j=0;j<length2;j++) {
			if(value1[i]==value2[j]) {
				System.out.println(value1[i]);
			}
			
		}
	}
	}

}
