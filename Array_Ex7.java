import java.util.Arrays;

public class Array_Ex7 {
	public static void main(String[] args) {
		// 	배열 섞기.
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			int tmp = arr[i]; // 두 변수 값 바꾸는 방법 활용. 빈 컵.
			int x = (int)(Math.random()*9);
			arr[i] = arr[x];
			arr[x] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}
}