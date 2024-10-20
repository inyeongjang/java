// 예제 3-15 : 0으로 나눌 때 발생하는 ArithmeticException 예외 처리
// try-catch 블록을 이용하여 예제 3-14를 수정, 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고 다시 입력 받는 프로그램

import java.util.Scanner;
import java.lang.ArithmeticException;

public class DevidedByZeroHandling {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("나뉨수를 입력하세요>> ");
				int dividend = scanner.nextInt();
				System.out.print("나눗수를 입력하세요>> ");
				int divisor = scanner.nextInt();
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
		}
	}
}
