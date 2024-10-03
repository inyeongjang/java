import java.util.Scanner;

public class ForSample {

	public static void main(String[] args) {
		
		// ex 3-1. for 문을 이용하여 1부터 10까지의 합출력
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if (i <= 9) System.out.print(" + ");
			else System.out.println(" = " + sum);
		}
	
		
		
		// ex 3-2. -1이 입력될 때까지 입력된 수의 평균 구하기
		
		int num = 0, total = 0, count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// 먼저 1개의 정수를 입력 받고 -1이면 반복문 실행하지 않음
		System.out.print("숫자 입력 : ");
		num = scanner.nextInt();
		
		while(num!=-1) {		
			total += num;
			count++;
			System.out.print("숫자 입력 : ");
			num = scanner.nextInt();
		}
		
		scanner.close();
		
		// 형 변환
		double avg = (double)total/count;
		
		if (count == 0) {System.out.println("입력된 숫자가 없습니다.");}
		else {System.out.println("입력된 숫자 개수 : " + count + " 평균 : " + avg);}
		
		
		
		// ex 3-3. a~z까지 출력 
		
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char)(c + 1); // 또는 c++;
		} while(c <= 'z');
	
		
		
		// ex 3-4. 2중 중첩을 이용한 구구단 출력
		
		// 가로 출력 
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			System.out.println("");
		}
		
		// 세로 출력 
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			System.out.println("");
		}
		
	}

}