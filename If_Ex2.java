import java.util.Scanner;

public class If_Ex2 {
	public static void main(String[] args) {
		// 성적 산출 프로그램 ver 2.0
		int score = 0;
		char grade = 'C', opt = '0';
		
		System.out.printf("점수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) { // 98점 이상이면 A+
				opt = '+';
			} else if (score < 94) { // 90점 이상, 94점 미만이면 A-
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) { // 88점 이상이면 B+
				opt = '+';
			} else if (score < 84) { // 80점 이상, 84점 미만이면 B-
				opt = '-';
		    }
		} // 나머지는 C0
		
		System.out.println("당신의 점수는 "+score+"입니다.");
		System.out.println("당신의 성적은 "+grade+opt+"입니다.");
			}
		}