import java.util.Arrays;

public class TwoD_Arr1 {

	public static void main(String[] args) {
		int[] arr1 = {20, 10, 30, 40};
		System.out.println(Arrays.toString(arr1));
		
		int[][] arr2 = new int[3][5];
		arr2[0][0] = 50;
		System.out.println(arr2[0][0]);
		
		int[][] arr3 = { {10, 20, 30},
						 {20, 30, 10},
					     {30, 20, 10}
					   };
		System.out.println(arr3[0][0]);
		System.out.println(arr3[2][2]);
		System.out.println(Arrays.toString(arr3[1]));
		}
	}