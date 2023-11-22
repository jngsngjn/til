import java.util.Scanner;
public class Switch_Ex1 {
	public static void main(String[] args) {
		// 현재 월을 입력하면, 계절을 알려주는 프로그램.
		System.out.print("현재 월을 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch (month) {
		case 3 : case 4 : case 5 :
			System.out.println("봄입니다.");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름입니다.");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을입니다.");
			break;
		default :
		    System.out.println("겨울입니다.");
		}
	}
}
