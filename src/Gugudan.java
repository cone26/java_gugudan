import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
//		//2단
//		System.out.println("-----2단-----");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//		//3단
//		System.out.println("-----3단-----");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
		
		//4단 변수사용
//		System.out.println("-----4단-----");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
		//5단 사용자에게 입력 + 변수사용
//		System.out.println("몇 단을 계산할까요?: ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		System.out.println("-----"+num+"단-----");		
//		System.out.println(num * 1);
//		System.out.println(num * 2);
//		System.out.println(num * 3);
//		System.out.println(num * 4);
//		System.out.println(num * 5);
//		System.out.println(num * 6);
//		System.out.println(num * 7);
//		System.out.println(num * 8);
//		System.out.println(num * 9);
//		
		//6단 while
//		System.out.println("-----6단-----");
//		int i = 1 ;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i ++;
//		}
//		
		//7단 for
//		System.out.println("-----7단-----");
//		for(int j =1 ; j < 10; j ++) {
//			System.out.println(7 * j);
//		}
		
		//2-9의 값이 아니면 에러 메세지 출력하기 => 반복문, if문 사용
//		System.out.println("몇 단을 계산할까요?: ");
//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		System.out.println("-----"+num+"단-----");
//		if(num < 2) {
//			System.out.println("값이 너무 작습니다.");
//		}else if (num > 9) {
//			System.out.println("값이 너무 큽니다.");
//		}else {
//			for(int i =1; i < 10; i ++) {
//				System.out.println(num * i);
//			}
//		}
		//내가 생각한 방법 
		//일단 한번 질문
		System.out.println("몇 단을 입력할까요?: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		//사용자가 입력한 값이 내가 원하는 값이 범위를 벗어났을 때 
		// 내가 원하는 범위에 들어올 떄까지 에러메세지 출력 + 다시 질문 반복하기
		while(2 > num || num > 9) {
			if(num < 2) {
				System.out.println("값이 너무 작습니다.");
			}else if (num > 9) {
				System.out.println("값이 너무 큽니다.");
			}
			System.out.println("몇 단을 입력할까요?: ");
			num = scanner.nextInt();
		}
		//내가 원하는 범위 내에 들어왔을 때 구구단 출력
		for(int i =1; i < 10; i ++) {
			System.out.println(num * i);
		}
	
		
	}
}
