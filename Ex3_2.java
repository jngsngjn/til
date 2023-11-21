
public class Ex3_2 {

	public static void main(String[] args) {
		// 증감 연산자
		int a = 0, b = 10;
		a = b++; // 후위형
		System.out.println("a = b++; 결과 a의 값은 "+a+"이며, b의 값은 "+b+"입니다."); // a = 10, b = 11
		
		a = 0;
		b = 10; // 전위형과 비교하기 위해 값 초기화
		
		a = ++b; // 전위형
		System.out.println("a = ++b; 결과 a의 값은 "+a+"이며, b의 값은 "+b+"입니다."); // a = 11, b = 11
	}

}
