package method;

// 두 수를 비교하는 함수를 만들고 호출하세요
// 둘 중에 더 큰 수를 구하고 반환하세요.
// 예시) 10,5 -> 10 2,7 -> 7 100,200 -> 200
public class Quiz2 {
	
	public static int max(int n1, int n2) { // 여기서 return을 2번 썼지만 실제로는 1번 동작
		
		if ( n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	public static void main(String[] args) {
		int max = max(3, 2);
		System.out.println(max);
	}

}
