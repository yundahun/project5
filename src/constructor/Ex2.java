package constructor;

public class Ex2 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "둘리";
		person1.height = 180;
		person1.weight = 80;
		
		Person person2 = new Person("또치");
		person2.height = 160;
		person2.weight = 50;
		
		Person person3 = new Person("도우너", 170, 60);

	}
}

class Person {

	String name;

	int height;

	int weight;

	public Person() {
	}

	public Person(String nm) { // 사람의 이름을 초기화 하는 생성자
		name = nm;
	}

	public Person(String nm, int he, int we) { // 사람의 이름, 키, 몸무게를 초기화 하는 생성자 
		name = nm;
		height = he;
		weight = we;
	}
}
