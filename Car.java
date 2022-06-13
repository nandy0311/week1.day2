package week1.day2;

/*
applyBreak()
applyGear()
switchOnAc()
applyAcclerate()
create object and excute for same class
create new class as MyCar class and create object for existing class and excute*/


public class Car {
	
	public void applyBreak() {
		System.out.println("apply break");
	}
	
	private void applyGear() {
		System.out.println("apply gear");
	}
	
	boolean switchOnAc() {
		System.out.println("true");
		return true;
	}
	
	public  void applyAccelerate() {
		System.out.println("accelerate");
		
	}
	public static void main(String[] args) {
		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAccelerate();

	}

}
