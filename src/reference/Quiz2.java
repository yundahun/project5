package reference;

public class Quiz2 {

	public static void main(String[] args) {
		Employee employee1 = new Employee("반다이크", 33, 5000000, 7);
		Employee employee2 = new Employee("살라", 32, 6000000, 8);
		Employee employee3 = new Employee("알리송", 32, 4500000, 7);
		
		Department department = new Department(employee1, employee2, employee3);
		
	}
}

class Employee {
	String name;
	int age;
	int pay;
	int year;
	
	public Employee(String name, int age, int pay, int year) {
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.year = year;
	}
}

class Department {
	Employee head;
	Employee senior;
	Employee junior;
	
	public Department(Employee head, Employee senior, Employee junior) {
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}
}