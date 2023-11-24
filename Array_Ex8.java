import java.util.Arrays;
public class Array_Ex8 {
	public static void main(String[] args) {
		// 	로또 번호 추천 프로그램.
		int[] arr = new int[45]; // 0~44 범위.
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1; // 1~45 정수로 배열 요소 초기화.
		}
		int tmp = 0; // 두 값을 바꾸는 데 사용할 임시 변수.
		int x = 0; // 임의의 값을 저장할 변수.
		
//		for(int i=0; i<6; i++) {
//			tmp = arr[i];
//			arr[i] = arr[(int)(Math.random()*45)];
//			arr[(int)(Math.random()*45)] = tmp;
//		} 위 방법대로 하면, 임의의 값을 저장해두지 않아서 임의의 값이 두 번 생성됨.
		for(int i=0; i<6; i++) {
			x = (int)(Math.random()*45);
			tmp = arr[i];
			arr[i] = arr[x];
			arr[x] = tmp;
		}
		for(int i=0; i<6; i++) {
			System.out.println(arr[i]);
		}
	}
}