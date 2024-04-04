package hiding;

public class Ex3 {

	public static void main(String[] args) {

		Person person = new Person();
		
	}
}

class Person {
	
	private String name;
	
	private int height;
	
	private double weight;

	public String getName() { //getter는 값을 내보낸다는 뜻이기때문에 return이 있고 매개변수가 없음
		return name;
	}

	public void setName(String name) { //setter는 값을 저장한다는 뜻이기때문에 return은 없고 매개변수가있음
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// source 메뉴 - generate getter and setter
	
}