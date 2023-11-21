
public class Ex3_14 {

	public static void main(String[] args) {
		// 비교 연산자 (비교 연산자는 결과 값이 true 또는 false 두 가지 중 하나임)
		System.out.println('A'>'B');
		// char끼리 산술 변환이기 때문에 모두 int으로 변환
		// 65 > 66 -> false
		
		// 문자열끼리 비교할 때는 '=='대신 equals() 메소드를 사용해야 함.
		String str1 = "ABC";
		String str2 = "ABC";
		System.out.println(str1==str2); // true
		System.out.println(str1.equals(str2)); // true
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3==str4); // false
		System.out.println(str3.equals(str4)); // true
	}

}
