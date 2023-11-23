public class Array_Ex1 {
	public static void main(String[] args) {
		// 배열의 선언과 생성
//		int[] score; // 배열 score를 선언.
//		score = new int[5]; // 배열 score 생성 (int 저장공간 5개)

		int[] score = new int[5]; // 한 문장으로 가능!
		score[3] = 100;
		System.out.println("score[3] = "+score[3]);
		int value = score[3];
		System.out.println("value = "+value);
		
		System.out.println();
		
		System.out.println("score[0] = "+score[0]);
		System.out.println("score[1] = "+score[1]);
		System.out.println("score[2] = "+score[2]);
		System.out.println("score[3] = "+score[3]);
		System.out.println("score[4] = "+score[4]);
		
		System.out.println();
		
		// 배열의 길이
		System.out.println("배열 score의 길이는 "+score.length+"입니다.");
		System.out.println();
		
		int[] arr = new int[6]; // 0,1,2,3,4,5
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		System.out.println();
		// 배열의 초기화
		int[] age = {10, 15, 50, 43, 25}; // int 저장공간 5개인 배열 생성과 동시에 초기화
		// 위 한 문장을 아래 두 문장으로 나누면 에러 발생.
//		int[] age;
//		age = {10, 15, 50, 43, 25};
		System.out.println("배열 age의 길이는 "+age.length+"입니다.");
		for(int i=0; i<age.length; i++) {
			System.out.println("age["+i+"] = "+age[i]);
		}
	}
}