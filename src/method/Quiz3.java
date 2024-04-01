package method;

// 합을 구하는 함수를 만들고 호출하세요.
// 두 수를 입력받아 n1부터 n2까지의 합을 반환하세요
// 예시) 5,10 => 5+6+7+8+9+10
public class Quiz3 {

	public static int sum(int n1, int n2) {
		int s = 0;
		for(int i = n1; i <= n2; i++) {
			s = s + i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int result = sum(5, 10);
		System.out.println(result);
	}

}
