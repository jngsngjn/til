
public class Math_round {

	public static void main(String[] args) {
		// 반올림
		double pi = 3.141592;
		System.out.println(Math.round(pi));
		// Math.round()는 소수점 첫 번째 자리에서 반올림한 정수 값을 출력
		System.out.println(pi); // 변수 값이 변하지는 않는다.
		
		// 원하는 자리에서 반올림하는 방법 (ex. 네 번째 자리에서 반올림) 3.142
//		double shortpi = pi * 1000; // 원래 값에 1000을 곱한다.
//		                            // 3.141592 * 1000 = 3141.592
//		shortpi = Math.round(shortpi); // 3142이 3142.0으로 형변환되어 저장됨
//		shortpi = shortpi / 1000; // 3142.0 / 1000 = 3.142
		
		double shortpi = Math.round(pi * 1000) / 1000.0; // 위의 세 줄을 한 줄로
		// 이 경우 마지막에 1000으로 나누지 않고 1000.0으로 나눠야 하는 것에 주의!
		System.out.println(shortpi);
	}

}
