// ex 2-5. /와 % 산술 연산
// 초 단위의 정수를 입력 받고, 몇 시 몇 분 몇 초인지 출력

import java.util.Scanner;

public class ArtithmeticOperator {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt();
		
		int seconds = time % 60;			// 60으로 나눈 나머지는 초 
		int minutes = (time / 60) % 60; 	// 60으로 나눈 몫을 60으로 나눈 나머지는 분 
		int hours = (time / 60) / 60;		// 60으로 나눈 몫을 60으로 나눈 몫 
		
		
		System.out.println(hours+"시간 "+minutes+"분 "+seconds+"초 ");
		
		scanner.close();
	}
}
