package instance;

public class Person {

	String personName; // 이름

	int age; // 나이

	boolean ismarried; // 결혼여부

	int numberOfChildren; // 자식 수

	// 학생의 모든 정보를 보여주는 함수 선언
	public void showPersonInfo() {

		System.out.println("이름:" + personName + ", 나이:" + age + ", 결혼여부 " + ismarried + ", 자식 수:" + numberOfChildren);
	}

}
