package method;

public class Ex1 {
	
		// 매개변수가 없고 반환 값이 없는 메소드
		public static void method1() {
			System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
			return; // 생략가능 (void 사용했을 때)
		}
		
		// 매개변수가 없고 반환값이 있는 메소드
		public static String method2() { //(return 뒤에 오는 타입과 일치 (여기서는 문장이라 String)
			return "매개변수가 없지만 반환값이 있는 메소드입니다.";
		}
		
		// 매개변수가 있고 반환값이 없는 메소드
		public static void method3(int num1, int num2) { // 반환값이 없기에 void, 매개변수 입력
			
			int sum = num1 + num2;
			
			System.out.println("sum :" + sum);
		}
		
		// 매개변수가 있고 반환값이 있는 메소드
		public static int method4(int num1, int num2) {
			
			return num1 + num2;
		}
		
		public static void main(String[] args) { // 위에는 껍데기, 호출은 메인함수에서
			method1(); // 리턴값 + 매개변수 둘다 없기 때문
			String str = method2(); // 매개변수는 없지만 리턴값은 있음 (변수를 선언함)
			method3(1, 2); 
			int i = method4(1, 2);
	}

}
