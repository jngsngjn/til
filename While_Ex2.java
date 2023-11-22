public class While_Ex2 {
	public static void main(String[] args) {
		// 1부터 연속된 수의 합이 100을 넘지 않는 가장 큰 합
		int a = 0, sum = 0;
		while (sum <= 100) {
			System.out.printf("%d - %d%n", a, sum);
			sum += ++a;
		}
	}
}