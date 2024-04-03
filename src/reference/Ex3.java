package reference;

public class Ex3 {

	public static void main(String[] args) {
		
		int num = 10;
		method1(num); // 값 전달
		System.out.println(num);
		
		Subject math = new Subject("수학", 100);
		method2(math); // 주소 전달
		System.out.println(math.scorePoint);
	}

	public static void method1(int n) {
		n = 5;
	}

	public static void method2(Subject sub) {
		sub.scorePoint = 50;
	}
}
