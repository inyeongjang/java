// ex 3-17. 입력 오류 시 발생하는 예외 (InputMismatchException)
// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성. 사용자가 정수가 아닌 문자를 입력할 때 발생하는 예외를 처리하여 다시 입력받도록 하라.

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n = 0;
	
		for(int i=0; i<3; i++) {
			System.out.print(i + " >> ");
			try {
				n = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				String s = scanner.nextLine();
				System.out.println(s + "은 정수가 아닙니다. 다시 입력하세요.");
				i--;
				continue;
			}
			sum += n;
		}
		
		System.out.println("합은 " + sum);
		scanner.close();
		
	}
}

