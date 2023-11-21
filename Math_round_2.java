
public class Math_round_2 {

	public static void main(String[] args) {
		// 버림 (소수점 자르기)
		double pi = 3.141592; // 3.141을 얻으려면?
		double shortpi = ((int)(pi * 1000)) / 1000.0;
		// pi * 1000 -> 3.141592 * 1000 -> 3141.592
		// (int)(3141.592) -> 3141
		// 3141 / 1000.0 -> 3.141
		System.out.println(shortpi);
	}

}
