import java.util.Arrays;

public class String_Array_Ex1 {

	public static void main(String[] args) {
		// 가위, 바위, 보 무작위로 출력하기.
		String[] strarr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strarr));
		
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strarr[tmp]);
		}
	}

}
