// ex 2-2.변수, 리터럴, 상수 활용
// 원의 면적 구하기

public class CircleArea{
	public static void main(String[] args) {
		final double PI = 3.14; 				// 원주율, 상수
		double radius = 10.0;					// 원의 반지름
		double circleArea = radius*radius*PI; 	// 원의 면적 계산
		System.out.println("원의 면적: "+circleArea);
	}
}
