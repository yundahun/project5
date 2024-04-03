package constructor;

public class Quiz1 {
	public static void main(String[] args) {
		
		Book book1 = new Book(); // 인스턴스1
		book1.title = "스프링부트";
		book1.price = 30000;
		book1.company = "한빛출판사";
		book1.page = 200;
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300); // 인스턴스2
	}
}

class Book {
	
	String title; // 하늘색 멤버변수
	
	int price;
	
	String company;
	
	int page;

	public Book() { // 디폴트 생성자
	}

	public Book(String title, int price, String company, int page) { // 모든 멤버변수를 입력받는 생성자
		super();
		this.title = title; // 파랑색 지역변수
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
}
