package constructor;

public class Quiz2 {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.factory = "현대";
		car1.model = "쏘나타";
		car1.color = "흰색";
		car1.maxSpeed = 200;
		
		Car car2 = new Car("기아", "레이", "검정색", 150);
		
		System.out.println(car1.maxSpeed);
	}
}

class Car {
	
	String factory;
	
	String model;	
	
	String color;	
	
	double maxSpeed;

	public Car() {
	}

	public Car(String company, String model, String color, double maxSpeed) {
		super();
		this.factory = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
