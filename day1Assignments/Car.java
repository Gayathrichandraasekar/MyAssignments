package week1.day1Assignments;

public class Car {
	public void applybreak() {
		System.out.println("Applied Break");
	}
    public void soundhorn() {
    	System.out.println("sound horn");
    }
	public static void main(String[] args) {
		Car working=new Car();
		working.applybreak();
		working.soundhorn();

	}

}
