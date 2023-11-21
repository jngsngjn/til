import java.util.Scanner; // import문 추가
public class ScannerEx2 {

	public static void main(String[] args) {
		// 2. Scanner 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// int를 받을 경우 두 줄로 입력 받아도 문제 없음
//		int num1, num2;
//		System.out.println("정수 두 개를 입력하시오.");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		System.out.println(num1+" "+num2);
		
		// next와 nextLine의 차이
		String str1, str2;
		System.out.println("문자열 두 개를 입력하시오.");
		str1 = sc.next(); // next는 개행문자 포함 X
		str2 = sc.nextLine(); // nextLine은 개행문자 포함 O
		System.out.println(str2+" "+str1);
		
	}

}
