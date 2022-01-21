
public class Gugudan_method {
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
	//메인
	public static void main (String[] args) {
	//반복문으로 함수 실행
		for(int i =2; i < 10; i ++) {
			int[] result = calc(i);
			print(result, i);
		}
	}
}
