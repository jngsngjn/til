public class For_Ex1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello.");
		}
//		System.out.println(i); // Error. 변수는 선언된 블럭{} 안에서만 유효함.
		
		// 조건식을 생략하면 무한 반복문이 됨.
		for (;;) {
			System.out.println("Hi.");
		}
//		String str; // Error. Unreachable Code
	}
}