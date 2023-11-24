import java.util.Scanner;
public class TwoD_Arr4 {
	public static void main(String[] args) {
		// 단어 맞히기 게임.
		String[][] arr = {
				{"Chair", "의자"}, // arr[0][0], arr[0][1]
				{"Winter", "겨울"},// arr[1][0], arr[1][1]
				{"Love", "사랑"}   // arr[2][0], arr[2][1]
				}; // 3행 2열
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("Quiz%d. %s는 무슨 뜻입니까? : ", i+1, arr[i][0]);
			
			String input = sc.nextLine();
			
			if (input.equals(arr[i][1])) {
				System.out.printf("정답입니다~!%n%n");
			} else {
				System.out.printf("오답입니다. 정답은 %s입니다.%n%n", arr[i][1]);
			}
		}
	}
}