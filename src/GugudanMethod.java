
public class GugudanMethod {
	// 계산하는 메소드
	public static int[] calc(int times) {
		int[] result = new int[9];
		for(int i =0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	//출력하는 메소드
	public static void print(int[] result, int i) {
		System.out.println("-----" + i + "단-----");
		for(int j =0; j < result.length; j++) {
			System.out.println(i + "*" + (j+1) + "=" + result[j]);
		}
	}

}
