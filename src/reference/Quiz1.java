package reference;

public class Quiz1 {

	public static void main(String[] args) {
		// 책 3권 생성
		Book book1 = new Book("나미야잡화점", 35000, "누리출판사", 150);
		Book book2 = new Book("아몬드", 18000, "별곰자리출판사", 210);
		Book book3 = new Book("기억전달자", 10000, "별곰자리출판사", 180);
		
		// 회원 객체 생성
		Member member = new Member(1001, "도미닉", book1, book2, book3);
	}
}

class Member {
	
	int memberNo;
	String name;
	Book book1;
	Book book2;
	Book book3;
	
	public Member(int memberNo, String name, Book book1, Book book2, Book book3) {
		this.memberNo = memberNo;
		this.name = name;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
}

class Book {
	
	String title;
	int price;
	String company;
	int page;
	
	public Book(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}

