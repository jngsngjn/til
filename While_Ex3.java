import java.util.Scanner;

public class While_Ex3 {
	public static void main(String[] args) {
		// 입력 받은 숫자의 각 자릿수를 더한 결과를 출력하는 프로그램
		System.out.print("양의 정수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while (num!=0) { // num이 0이 되면 빠져나온다. num은 정수이기 때문에.
			// 10으로 나머지 연산을 하면 마지막 자리를 얻음.
			sum = sum + num % 10; // 각 자릿수를 구해 누적합을 저장하고
			num = num / 10; // 한 자리씩 줄여감. 12345 -> 1234 ... 123 ...
		}
		
//		위의 while문을 for문으로 변환하면...
//		for (; num>0; num=num/10) {
//			sum = sum + num % 10;
//		}
		System.out.println("각 자릿수의 합은 "+sum+"입니다.");
	}
}