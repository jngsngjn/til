import java.util.Scanner; // 1. import문 추가

public class ScannerEx1 {

	public static void main(String[] args) {
		// 2. Scanner 클래스의 객체 생성
		Scanner sc = new Scanner(System.in);

		System.out.printf("띄어쓰기 포함하여 문자열 입력해보기 : ");
		String str1 = sc.nextLine(); // 공백 포함
		System.out.println(str1);
		
		System.out.printf("띄어쓰기 포함하여 문자열 입력해보기 : ");
		String str2 = sc.next(); // 공백 미포함
		System.out.println(str2);
		
//		System.out.printf("정수 입력하기 : ");
//		int num = sc.nextInt();
//		System.out.println(num);
		
		// 아래 두 줄 = int num = sc.nextInt();
//		String str = sc.nextLine();
//		int num = Integer.parseInt(str); // 문자열을 숫자로 변환시켜주는 메소드
//		System.out.println(num);         // 숫자를 문자열로 변환할 때는? 숫자 + ""
		
//		System.out.printf("이름을 입력하세요. : ");
//		String name = sc.nextLine();
//		System.out.println("당신의 이름은 "+name+"입니다.");
//		
//		System.out.printf("주소를 입력하세요. : ");
//		String addr = sc.nextLine();
//		System.out.println("당신의 주소는 "+addr+"입니다.");
//		
//		System.out.printf("나이를 입력하세요. : ");
//		int age = sc.nextInt();
//		System.out.println("당신의 현재 나이는 "+age+"세이고, 5년 뒤 나이는 "+(age + 5)+"세입니다.");
	}

}
