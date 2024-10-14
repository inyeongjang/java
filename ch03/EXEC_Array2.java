import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class EXEC_Array2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Scanner scanner = new Scanner(System.in);

		int intArr [][] = new int[4][4];
		
		for(int i=0; i<intArr.length; i++) {			
			for(int j=0; j<intArr[i].length; j++) {				
				intArr[i][j] = r.nextInt(256);
				System.out.print(intArr[i][j] + "\t");
			}			
			System.out.println();
		}
		
		
		int k;
		
		while(true) {
			System.out.println();
			System.out.print("임계값 입력 >>> ");
			try {
				k = scanner.nextInt();
				System.out.println();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println();
				System.out.println("숫자가 아닙니다.다시 입력하세요.");
				scanner.next(); // 남아 있는 입력값 지우기 
			}
		}
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				if(intArr[i][j] > k) intArr[i][j] = 255;
				else intArr[i][j] = 0;
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
