public class Break_Ex2 {
	public static void main(String[] args) {
		// 중첩 반복문을 한 번에 빠져 나오는 방법.
		// 반복문에 이름을 붙이기.
		// 구구단
		System.out.println("구구단 시작!");
		Loof1 : for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if (j==5) {
						break Loof1;
					}
					System.out.printf("%d x %d = %d%n", i, j, (i*j));
				}
				System.out.println();
		}
		System.out.println("구구단 끝!");
	}
}