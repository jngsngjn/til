
public class Ex2_12 {

	public static void main(String[] args) {
		// 타입 간 변환 방법
//		System.out.println(3+'0'); // 숫자와 문자를 더할 수 없으니, 문자 '0'을 숫자로 바꿔서(48) 출력됨.
		System.out.println((char)(3+'0')); // 숫자에 문자 0을 더하면 문자가 되고,
		System.out.println('3'-'0'+1); // 문자에 문자 0을 빼면 숫자가 된다.
		
		String str1 = 123+""; // 숫자에 빈 문자열을 더하면 문자열이 되고,
		System.out.println(str1); // 문자열 "123"
		String str2 = 'A'+""; // 문자에 빈 문자열을 더하면 문자열이 된다.
		System.out.println(str2); // 문자열 "A"
		
		char ch = "5".charAt(0); // 문자열을 문자로 바꾸는 방법
		System.out.println(ch); // 문자 '5'
		
		String str3 = "65";
		int num1 = Integer.parseInt(str3); // 문자열을 정수로 바꾸는 방법
		System.out.println(num1+3); // 정수 65 + 3 = 68
		
		String str4 = "3.14";
		double num2 = Double.parseDouble(str4); // 문자열을 실수로 바꾸는 방법
		System.out.printf("%.2f%n", num2+0.2); // 실수 3.14 + 0.2 = 3.34
	}

}
