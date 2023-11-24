public class TwoD_Arr3 {
	public static void main(String[] args) {
		// 1번부터 5번 학생의 성적표.
		int[][] score = {
				  { 100, 100, 100}
				, { 20, 20, 20}
				, { 30, 30, 30}
				, { 40, 40, 40}
				, { 50, 50, 50} // 5행 3열 int 타입의 2차원 배열.
			};
		int kortotal = 0, engtotal = 0, mathtotal = 0; // 각 과목의 총점을 저장할 변수 초기화.
		
		System.out.println("번호  국어  영어  수학  총점  평균 ");
		System.out.println("=============================");
		
		for(int i=0; i<score.length; i++) {
			int total = 0; // 개인별 총점.
			float average = 0; // 개인별 평균.
			
			kortotal = kortotal + score[i][0];
			engtotal = engtotal + score[i][1];
			mathtotal = mathtotal + score[i][2]; // 총점 누적합하여 저장.
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%5d", score[i][j]); // 각 학생의 과목 점수 출력.
				total = total + score[i][j];
				average = total / (float)score[i].length; // 학생이 바뀔 때마다 그 학생의 총점과 평균 저장.
			}
			System.out.printf("%5d %5.1f%n", total, average); // 초기화 하기 전에 출력.
		}
		System.out.println("=============================");
		System.out.printf("총점:%4d %4d %4d%n", kortotal, engtotal, mathtotal);
	}
}