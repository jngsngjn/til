
public class PrintfEx1 {

	public static void main(String[] args) {
		// 정수 지시자
		System.out.printf("%d", 15); // 십진수 (printf는 줄 바꿈 기능 없음)
		System.out.printf("%o%n", 15); // 8진수 (%n = 개행문자)
		System.out.printf("%#x%n", 15); // 16진수 (#를 추가하여 접두사 출력) 
		System.out.printf("%#X%n", 15); // 16진수 (대문자 사용하면 출력 값도 대문자)
		System.out.printf("%s", Integer.toBinaryString(15)); // 15를 2진 문자열로 변환
		
		// 실수 지시자
		float f = 123.4567891f;
		System.out.printf("%f%n", f); // float 정밀도 7자리 / 뒤에 87은 의미 없음
		double d = 123.4567891;
		System.out.printf("%f%n", d); // double 정밀도 15자리 / %f는 소숫점 뒤 6자리까지 출력		
		System.out.printf("%e%n", f); // e+02 -> 10의 2제곱 / 소숫점 맨 마지막 숫자 반올림해서 보여줌
		System.out.printf("%E%n", f);
		System.out.printf("%g%n", 123.4567891); // 소숫점 포함하여 7자리로 출력 / 마지막 숫자 반올림
		System.out.printf("%g%n", 0.00000001); // %g 지시자는 %f와 %e 값 중 간략한 값을 출력함
		// 대부분의 실수는 %f 사용하여 출력하고 0이 많이 붙는 경우에 %e 사용함
		
		// 자릿수 지정
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%5d]%n", 1000000); // 출력할 값의 자릿수가 지정한 자릿수 보다 많으면 무시하고 출력
		System.out.printf("(%-5d)%n", 10); // 왼쪽 정렬
		System.out.printf("[%05d)%n", 10); // 공백을 0으로 채움
		
		System.out.printf("%8.2f%n", 1111.2272); // 소숫점 포함 전체 8자리 중 소숫점 자리 2자리
		System.out.printf("%10.3f%n", 1234.55); // 정수 앞 부분은 공백으로 채우고 소숫점은 0으로 채움 (빈 자리)
		System.out.printf("%.4f%n", 1.234567); // 소숫점 네 번째까지만 출력
		
		System.out.printf("(%s)%n", "www.naver.com");
		System.out.printf("(%15s)%n", "www.naver.com"); // 빈 자리 공백
		System.out.printf("(%5s)%n", "www.naver.com"); // 출력할 값의 자릿수가 지정한 자릿수 보다 많으면 무시하고 출력
		System.out.printf("(%-15s)%n", "www.naver.com"); // 왼쪽 정렬
		System.out.printf("(%.6s)%n", "www.naver.com"); // 6개 단어만 출력

	}

}
