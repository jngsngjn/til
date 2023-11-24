import java.util.Arrays;

public class Arrays_Ex9 {
	public static void main(String[] args) {
		// Arrays 클래스의 메서드
		// 1. toString()
		int[] iarr = {1, 2, 3, 4, 5};
		int[][] iarr2D = {{1,2},
				          {2,4}};
		System.out.println(Arrays.toString(iarr)); // 1차원 배열.
		System.out.println(Arrays.toString(iarr2D)); // 원하는 값 출력되지 않음.
		System.out.println(Arrays.deepToString(iarr2D)); // 다차원 배열.
		
		System.out.println();
		
		// 2. equals()
		String[][] str2D1 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		System.out.println(Arrays.equals(str2D1, str2D2)); // false, 1차원 배열 비교할 때 사용.
		System.out.println(Arrays.deepEquals(str2D1, str2D2)); // true
		
		// 3. copyOf(), copyOfRange() / 배열 복사
		int[] arr1 = {0, 1, 2, 3, 4};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length); // (복사할 배열, 복사할 요소의 개수) / arr2 = {0,1,2,3,4}
		int[] arr3 = Arrays.copyOf(arr1, 3); // arr3 = {0,1,2}
		int[] arr4 = Arrays.copyOf(arr1, 8); // arr4 = {0,1,2,3,4,0,0,0}
		int[] arr5 = Arrays.copyOfRange(arr1, 1, 4); // arr5 = {1,2,3} / (복사할 배열, from, to) * to 포함 X
		int[] arr6 = Arrays.copyOfRange(arr1, 2, 7); // arr6 = {2,3,4,0,0}
		
		// 4. sort() / 배열 정렬
		int[] arr7 = {5,3,1,0,2};
		Arrays.sort(arr7); // 오름차순 정렬. arr7 = {0,1,2,3,5}
		char[] charr1 = {'d', 'a', 'f', 'e', 'c'};
		Arrays.sort(charr1); // charr1 = {'a', 'c', 'd', 'e', 'f'}
		String[] strarr1 = {"BBA", "CAB", "ABC", "DDD"};
		Arrays.sort(strarr1); // strarr1 = {"ABC", "BBA", "CAB", "DDD"}
	}

}