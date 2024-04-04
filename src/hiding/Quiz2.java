package hiding;

public class Quiz2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setFactory("Hyundai");
		car.setModelName("Sonata");
		car.setColor("white");
		car.setMaxSpeed(200);
		System.out.println("제조사는 " + car.getFactory() + "입니다.");
		System.out.println("모델명은 " + car.getModelName()+  "입니다.");
		System.out.println("색은 " + car.getColor() + "입니다.");
		System.out.println("최고속도는 " + car.getMaxSpeed() + "입니다.");
	}

}

class Car {
	private String factory;
	private String modelName;
	private String color;
	private int maxSpeed;
	
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}