import java.util.Scanner;
public class Do_while_Ex1 {
	public static void main(String[] args) {
		// 1~100 사이의 정수 중 무작위로 생성되는 정수를 맞히는 게임
		int input = 0, answer = 0;
//		answer = Math.random(); // 0.0 <= x < 1.0
//		answer = Math.random()*100; // 0.0 <= x < 100.0
//		answer = (int)(Math.random()*100); // 0 <= x < 100
		answer = (int)(Math.random()*100)+1; // 0 <= x < 101
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1~100 사이의 정수를 입력하세요. : ");
			input = sc.nextInt();
			if (input>answer) {
				System.out.println("더 작은 정수로 다시 시도하세요.");
			} else if (input<answer) {
				System.out.println("더 큰 정수로 다시 시도하세요.");
			}
		}while (input != answer);
		
		System.out.println("정답입니다.");
	}
}
