public class Break_Ex1 {
	public static void main(String[] args) {
		// 반복문에서의 break
		int i = 0, sum = 0;
		while (true) { // 무한반복문. for(;;) {}
			if (sum>100) {
				break; // 자신이 속한 하나의 반복문을 벗어난다.
			}
			++i;
			sum = sum + i;
		}
		// break 사용 X
		while (sum<=100) {
			++i;
			sum = sum + i;
		}
		// for문으로 변경
		for (;;) {
			if (sum>100) {
				break;
			}
			++i;
			sum = sum + i;
		}
		System.out.println("1부터 차례대로 계속 더하다가 처음 100보다 커지는 값은");
		System.out.println("1부터 "+i+"까지 더한 값이며");
		System.out.println("그 값은 "+sum+"입니다.");
	}
}