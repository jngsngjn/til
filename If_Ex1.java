import java.util.Scanner;

public class If_Ex1 {
	public static void main(String[] args) {
		// 성적 산출 프로그램 ver 1.0
		int score;
		char grade = 'D'; // 코드를 간단히 하기 위해 초기 grade 값을 'D'로 초기화하고 else문을 삭제해도 됨.
		
		System.out.printf("점수를 입력하세요. : ");
		
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) { 
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} 
//		  else {
//			grade = 'D';
//		}
		
		System.out.println("당신의 점수는 "+score+"입니다.");
		System.out.println("당신의 성적은 "+grade+"입니다.");
			}
		}