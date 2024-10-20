// ex 4-1. Circle 클래스의 객체 생성 및 활용
// 반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체 생성
public class Circle {
	
	int radius;
	String name; 
	
	public Circle() {} 
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main (String[] args) {
		Circle c1 = new Circle();
		c1.name = "Circle1";
		c1.radius = 10;
		c1.getArea();
		System.out.println("이름 " + c1.name + " 반지름 " + c1.radius + " 넓이 "+ c1.getArea());
		
		Circle c2 = new Circle();
		c2.name = "Circle2";
		c2.radius = 2;
		c2.getArea();
		System.out.println("이름 " + c2.name + " 반지름 " + c2.radius + " 넓이 "+ c2.getArea());
	}
}
