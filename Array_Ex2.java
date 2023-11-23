import java.util.Arrays;

public class Array_Ex2 {
	public static void main(String[] args) {
		// 배열 초기화 하는 법 세 가지
		// 첫 번째 방법
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 10;
		arr1[2] = 100;
		arr1[3] = 1000;
		arr1[4] = 10000;
		for (int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		// 두 번째 방법
		int[] arr2 = new int[] {10,20,40,80,160};
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		// 세 번째 방법
		int[] arr3 = {10,20,30,40,50};
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		// 세 번째 방법만 기억하되, int[] arr3 = {10,20,30,40,50}; 이 문장을 다음과 같이 두 문장으로 나눌 수 없다는 것만 주의하자.
		// int[] arr3;
		// arr3 = {10,20,30,40,50};
			
		// 하나 더 있었음..
		int[] iarr = new int[5];
		for(int a=0; a<iarr.length; a++) {
			iarr[a] = a*10;
		}
		System.out.println(Arrays.toString(iarr));
		}
	}
