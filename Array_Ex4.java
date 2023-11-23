import java.util.Arrays;

public class Array_Ex4 {

	public static void main(String[] args) {
		int[] iarr = new int[10];
		for(int i=0; i<iarr.length; i++) {
			iarr[i] = (int)(Math.random()*10)+1;
		}
		for(int i=0; i<iarr.length; i++) {
			System.out.print(iarr[i]+", ");			
		}
		System.out.println();
		System.out.println(Arrays.toString(iarr));
	}

}