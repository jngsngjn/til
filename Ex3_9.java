
public class Ex3_9 {

	public static void main(String[] args) {
		// 산술 변환
		int a = 1_000_000, b = 1_000_000;
		long c = a * b;
		// c = 1000000 * 1000000 (결과 값이 int 범위 초과)
		System.out.println(c);
		System.out.println("형변환을 해주지 않아서 오버플로우가 발생했습니다.");
		
		System.out.println();
		
		long d = (long)a * b;
		// d = 1000000L * 1000000 (타입이 맞지 않아서 값 손실이 없는 쪽으로 자동 형변환)
		// d = 1000000L * 1000000L
		// d = 1000000000000L
		
		System.out.println(d);
		System.out.println("올바른 값입니다.");
	}

}
