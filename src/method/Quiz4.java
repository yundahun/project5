package method;
/*
 * 빼기 메수드를 만들고 호출하세요.
 * 두 수를 입력받아 첫번째 수에서 두번째 수를 뺀 후 그 결과를 반환하세요.
 * 단 첫번째 수가 두번째 수보다 작으면 -999를 반환하고 함수를 종료하세요.
 * */
public class Quiz4 {
	
	public static int min(int n1, int n2) {
		
		if(n1 < n2) {
			return -999;
		}
		
		int result = n1 - n2; // 두 수의 차

		return result;
	}
	
	
	public static void main(String[] args) {
		

	}

}
