package method;

// 사칙연산을 수행하는 함수를 만들고 호출하세요.
// 두 숫자를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력하세요.
// 예시) 10, 5 => 15, 5, 50, 2, 0
public class Quiz1 {
	// 함수를 만드는 구성 1.이름 2.매개변수 -> 숫자 (O) 3.리턴값
	public static void arithmetic(int n1, int n2) {
		System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
		System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
		System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
		System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
		System.out.println(n1 + "%" + n2 + "=" + (n1 % n2));
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		arithmetic(10, 5);

	}

}
