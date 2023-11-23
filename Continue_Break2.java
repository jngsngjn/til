import java.util.Scanner;
public class Continue_Break2 {
	public static void main(String[] args) {
		// 제곱, 제곱근, log
		int input = 0, num = 0;
		Scanner sc = new Scanner(System.in);
		
		Loof1 :
		while (true) {
			System.out.println("(1) Square");
			System.out.println("(2) Square root");
			System.out.println("(3) log");
			System.out.println("원하시는 메뉴(1~3)를 입력하세요. (종료 : 0)");
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
			while (true) {
				System.out.println("계산할 값을 입력하세요. (계산 종료 : 0 / 전체 종료 : 99)");
				num = sc.nextInt();
				if (num==0) {
					break;
				} else if (num==99) {
					System.out.println("종료되었습니다. 감사합니다.");
					break Loof1;
				} switch (input) {
				case 1 :
					System.out.println("계산 결과 "+(num*num)+"입니다.");
					break;
				case 2 :
					System.out.println("계산 결과 "+(Math.sqrt(num))+"입니다.");
					break;
				case 3 :
					System.out.println("계산 결과 "+(Math.log(num))+"입니다.");
					break;
				}
			}
		}
	}
}