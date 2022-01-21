
public class GugudanMain {
	//메인
	public static void main (String[] args) {
	//반복문으로 함수 실행
		for(int i =2; i < 10; i ++) {
			int[] result = GugudanMethod.calc(i);
			GugudanMethod.print(result, i);
		}
	}
}
