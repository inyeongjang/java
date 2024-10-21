// ex 2-10. if문 사용하기

// 시험 점수가 80점 이상이면 합격 판별을 하는 프로그램

import java.util.Scanner;

public class SuccessOrFail {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오: ");
		int score = scanner.nextInt();
		
		if(score>=80)
			System.out.println("합격입니다.");
		
		scanner.close();
	}
}
