public class Continue_Ex1 {
	public static void main(String[] args) {
		// 	1부터 50까지의 정수 중 3의 배수만 출력하는 프로그램.
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// 1부터 15까지의 정수 중 3의 배수가 아닌 정수만 출력하는 프로그램.
		for (int i=1; i<=15; i++) {
			if (i%3!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// 위 for문을 continue를 이용하여 바꾸면..
		for (int i=1; i<=15; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
	}
}