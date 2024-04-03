package reference;

public class Ex1 {

	public static void main(String[] args) {
		
		Subject math = new Subject("수학", 85);
		
		Subject korean = new Subject("국어", 100);
		
		Student student = new Student(1001, "둘리", math, korean);
		
	}
}

class Subject {
	
	String subjectName; // 과목
	
	int scorePoint; // 점수

	public Subject(String subjectName, int scorePoint) { // 모든 멤버를 초기화하는 생성자
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}
	
}

class Student {
	
	int studentID; // 학번
	String studentName; // 이름
	Subject math; // 수학과목 (자료형이 class임)
	Subject korean; // 국어과목 (자료형이 class임)

	public Student(int studentID, String studentName, Subject math, Subject korean) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}
	
	
}