
public class Array_Ex6 {
	public static void main(String[] args) {
		// 	최댓값과 최솟값 구하기.
		int[] score = {123, 345, 325, 353, 134, 943};
		int max = score[0];
		int min = score[0]; // 변수 max와 min을 배열의 첫 번째 값으로 초기화.
		
		for(int i=1; i<score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최댓값 = "+max);
		System.out.println("최솟값 = "+min);
	}
}