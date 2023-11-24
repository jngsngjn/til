
public class String_Ex1 {
	public static void main(String[] args) {
		// String 클래스의 자주 사용되는 메서드 다섯 가지.
		// String 클래스는 문자 배열(char[])과 메서드를 결합한 것.
		// 1. charAt() 01234 (Index)
		String str1 = "ABCDE";
		char ch1 = str1.charAt(3); // 'D'
		System.out.println(ch1);
		// 2. length()
		System.out.println("문자열 "+str1+"의 길이는 "+str1.length()+"입니다.");
		// 3. substring(int from, int to) * to는 포함하지 않음.
		String str2 = "안녕하세요.";
		String substr1 = str2.substring(1,4); // 녕하세
		System.out.println(substr1);
		
		String substr2 = str2.substring(1); // 녕하세요.
		System.out.println(substr2);
		// 4. equals() / 문자열의 내용이 같은지 확인함. true or false
		String str3 = "JAVA", str4 = "JAVA ";
		System.out.println(str3.equals(str4)); // true
		// 5. toCharArray() / 문자열을 문자배열로 변환하여 반환함.
		String str5 = "Hello, World.";
		char[] charr = str5.toCharArray();
	}
}