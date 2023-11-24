import java.util.Arrays;

public class TwoD_Arr2 {

	public static void main(String[] args) {
		// 2차원 정수 배열의 전체 합 구하기.
		int sum = 0;
		int[][] score = {
				{100, 100, 100},
				{ 20,  20,  20},
				{ 30,  30,  30},
				{ 40,  40,  40}
			};
		for(int i=0; i<score.length; i++) { // score.length = 4 / 한 덩어리씩 끊어서 생각해봐.
			for(int j=0; j<score[i].length; j++) {
				sum = sum + score[i][j];
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
			}
		}
		System.out.println("sum = "+sum);
	}
}