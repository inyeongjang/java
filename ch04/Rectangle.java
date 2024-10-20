// ex 4-2. Rectangle 클래스 만들기
// 너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램
// 너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 활용

import java.util.Scanner;
import java.util.InputMismatchException;

public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle() {};
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		while(true) {
			try {
				System.out.print(">> ");
				rect.width = scanner.nextInt();
				rect.height = scanner.nextInt();
				break;
			} 
			catch(InputMismatchException e) {
				scanner.nextLine();
				System.out.println("다시 입력하세요.");
			}
		} 
		
		int area = rect.getArea();
		
		System.out.println("사각형의 면적 " + area);
		
		scanner.close();
	}
}
