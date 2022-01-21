//
public class GugudanArray {
	public static void main_array(String[] args) {
		//배열을 이용해서 구구단 출력하기 + 2중반복문
		int[] result = new int[9];
		for(int i = 2; i < 10; i ++) {
			System.out.println("-----" + i + "단-----");
			for(int j = 0; j < result.length; j++) {
				result[j] = i * (j+1);
			}
			for (int j = 0; j < result.length; j ++) {
				System.out.println(i + "*" + (j+1) + " = "+ result[j]);
			}
		}
	}
}
