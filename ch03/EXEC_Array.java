import java.util.Random;
import java.util.Scanner;

public class EXEC_Array {

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
		
		System.out.println();
		
		System.out.print("임계값 입력 >>> ");
		int k = scanner.nextInt();
		System.out.println();
		
		for(int i=0; i<intArr.length; i++) {
			for(int j=0; j<intArr[i].length; j++) {
				if(intArr[i][j] > k) intArr[i][j] = 255;
				else intArr[i][j] = 0;
				System.out.print(intArr[i][j] + "\t");
			}
			System.out.println("");
		}
		
		scanner.close();
		
	}

}