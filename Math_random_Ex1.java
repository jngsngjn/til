public class Math_random_Ex1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			// Quiz 1. 1~10까지 정수 20번 무작위 생성
			// 1,2,3,4,5,6,7,8,9,10
//			System.out.println(Math.random()); // 0.0 <= x < 1.0
//			System.out.println(Math.random()*10); // 0.0 <= x < 10.0
//			System.out.println((int)(Math.random()*10)); // 0 <= x < 10
			System.out.println((int)(Math.random()*10)+1); // 1 <= x < 11
		}
		
			// Quiz 2. -5~5까지 정수 20번 무작위 생성
			// -5,-4,-3,-2,-1,0,1,2,3,4,5
		for (int k = 1; k <= 20; k++) {
//			System.out.println(Math.random()); // 0.0 <= x < 1.0
//			System.out.println(Math.random()*11); // 0.0 <= x < 11.0
//			System.out.println((int)(Math.random()*11)); // 0 <= x < 11
			System.out.println((int)(Math.random()*11)-5); // -5 <= x < 6
		}
	}
}