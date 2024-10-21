// ex 2-4. Scanner를 이용한 키 입력 연습 
// Scanner를 이용하여 이름, 도시, 나이, 체중, 독신 여부를 입력 받고 다시 출력

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		String name = scanner.next();
		System.out.print("이름은 "+name+", ");
		String city = scanner.next();
		System.out.print("도시는 "+city+", ");
		int age = scanner.nextInt();
		System.out.print("나이는 "+age+"살, ");
		double weight = scanner.nextDouble();
		System.out.print("체중은 "+weight+"kg, ");
		boolean single = scanner.nextBoolean();	
		System.out.print("독신 여부는 "+single+"입니다.");
		
		System.out.println();
		
		System.out.println("두 수를 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("두 수의 합은 "+(a+b)+"입니다.");
		
		System.out.println();
		
		System.out.println("a를 입력하세요");
		a = scanner.nextInt();
		System.out.println("b를 입력하세요");
		b = scanner.nextInt();
		System.out.println("두 수의 합은 "+(a+b)+"입니다.");
		
		System.out.println();
		
		scanner.close();
		
	}
}