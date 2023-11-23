import java.util.Arrays; // command + shift + o : import문 자동 추가

public class Array_Ex3 {

	public static void main(String[] args) {
		// 배열의 출력
		int[] iarr = {1, 2, 3, 4, 5};
		System.out.println(iarr); // 이상한 결과 출력됨..
		
		char[] charr = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(charr); // char 타입 배열만 됨..
		
		// 배열의 각 요소를 모두 출력하는 방법
		// for문 사용
		for(int i=0; i<iarr.length; i++) {
			System.out.println("iarr["+i+"] = "+iarr[i]);
		}
		// Arrays.toString() 메소드 사용
		System.out.println(Arrays.toString(iarr)); // 문자열 "[1, 2, 3, 4, 5]" 출력
												   // import문 필요함.	
	}

}
