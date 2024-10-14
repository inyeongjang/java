import java.util.Scanner;

public class ContinueBreak {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ex 3-5) continue 문을 이용하여 양수 합 구하기 
		// 5개의 정수를 입력 받고 그 중 양수들만 합하여 출력 
		
		// 1) while 
		
		int i = 0, n = 0, sum = 0;
		
		System.out.print("5개의 정수를 입력하시오: ");
		
		while (i<5) {
			
			i++;
			
			n = scanner.nextInt();
			
			if (n <= 0) {
				continue;
			} else {
				sum += n;
			}	
		}
		
		System.out.print("양수의 합: " + sum);

		
		// 2) for 
			
		n = 0; sum = 0;
		
		System.out.print("5개의 정수를 입력하시오: ");
		
		for (i=0; i<5; i++) {
			n = scanner.nextInt();
			if (n <= 0) {
				continue;
			} else {
				sum += n;
			}	
		}
		
		System.out.print("양수의 합: " + sum);
		
		
		
		// ex 3-6) break문을 이용하여 while문 벗어나기
		// exit이 입력되면 while문을 벗어난다. 
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			if (text.equals("exit")) break;
		}
		
		System.out.println("종료합니다.");
		
		scanner.close();
		
		
		
		
		// 연습 1) for(;;);의 실행 결과 - 무한 loop
		
		
		
		// 연습 2) for, while, do-while로 * 출력하기  
		
		for (i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--){
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		int m = 5;
		while(m>0) {
			n = 0;
			while(n<m) {
				System.out.print('*');
				n++;
			}
			System.out.println();
			m--;
		}
		
		/*int i = 0;
			while (i < 5) {
			int j = 5 - i; 
			while (j-- > 0) {
				System.out.print("*");
			}
			System.out.println("");
			i++;
		}*/
		
		int p = 5;
		do {
			int q = 0;
			do {
				System.out.print('*');
				q++;
			} while(q<p);
			System.out.println();
			p--;
		} while(p>0);

		/*i = 0;
			do {
			int j = 5-i;
			do {
				System.out.print("*");
			} while (--j>0); 
			System.out.println("");
		} while(++i<5);*/	
		
		/* 		
			int sum = 0; 
			for (i = 1; i<=100; i++) {
				if (i%3!=0) continue;
				sum+=i;
			}
			System.out.print(sum);
		 */
		
	}
}