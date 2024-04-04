package hiding;

public class Quiz3 {

	public static void main(String[] args) {

		MyDate3 myDate3 = new MyDate3();
		myDate3.setMonth(3);
		myDate3.setDay(19);

		System.out.println("현재는 " + myDate3.getMonth() + "월 " + myDate3.getDay() + "일 입니다.");
	}
}

class MyDate3 {

	private int month;
	private int day;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("잘못된 월입니다.");
			return;
		}
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
}