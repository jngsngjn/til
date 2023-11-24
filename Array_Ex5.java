import java.util.Scanner;
public class Array_Ex5 {
	// 총점과 평균 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과목 5개의 점수를 입력하세요.");
		int[] score = new int[5];
		int sum = 0;
		float average = 0;
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		System.out.println("총점 = "+sum);
		average = sum / (float)score.length;
		System.out.println("평균 = "+average);
		
	}

}