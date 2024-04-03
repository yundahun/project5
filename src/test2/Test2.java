package test2;

public class Test2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.name = "둘리";
		
		person.height = 170;
		
		// person.weight = private (사용 불가능)
		
	}
}

class Person { // public(어디서나) > default(내부패키지에서만) > private (클래스내부에서만)
	public String name; // 이름
	int height; // 키
	private double weight; // 몸무게
	
	public void showINfo() {
		System.out.println("이름" + name + "키:" + height + "몸무게:" + weight);
	}
}