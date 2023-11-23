import java.util.Scanner;
public class Continue_Break {
	public static void main(String[] args) {
		// 허접한 보이는 ars 프로그램 만들기.
		// 무한반복문(break문, continue문 포함)
		int input = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("(1) 잔액 조회");
			System.out.println("(2) 계좌 이체");
			System.out.println("(3) 상담사 연결");
			System.out.println("원하시는 메뉴(1~3)를 선택하세요.");
			System.out.print("종료하시려면 0을 입력하세요. : ");
			input = sc.nextInt();
			if (input==0) {
				System.out.println("종료되었습니다. 감사합니다.");
				break;
			} else if (!(1<=input&&input<=3)) { // (input<0||input>=4)
				System.out.println("번호를 잘못 입력하셨습니다. 다시 시도하세요.");
				System.out.println();
				continue;
			}
			System.out.println("입력하신 메뉴는 "+input+"번 메뉴입니다.");
			System.out.println();
		}
	}	
}