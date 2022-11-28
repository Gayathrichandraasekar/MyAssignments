package week1.day1Assignments;

public class Bike {
	public void applygear() {
		System.out.println("applied gear");
	}

	public static void main(String[] args) {
		Car bikeobject=new Car();
		bikeobject.applybreak();
		bikeobject.soundhorn();
		Bike details=new Bike();
        details.applygear();
	}

}
