package instance;

public class Quiz1 {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.personName = "James";
		person.age = 40;
		person.ismarried = true;
		person.numberOfChildren = 3;
		
		person.showPersonInfo();
		
		System.out.println("객체의 주소는 " + person + " 입니다.");

	}

}
