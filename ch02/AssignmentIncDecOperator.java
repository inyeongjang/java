// ex 2-6. 대입 연산자와 증감 연산자 

public class AssignmentIncDecOperator {
	
	public static void main(String[] args) {
		
		int a=3, b=3, c=3, d=3;
		
		// 대입 연산자 
		a += 3; // a = a + 3 = 6
		b *= 3; // b = b * 3 = 9 
		c %= 2; // c = c % 2 = 1 
		System.out.println("a = "+a+", b = "+b+", c = "+c); // a = 6, b = 9, c = 1
		
		// 증감 연산자 
		a=d++; // a = d = 3, d = d + 1 = 4
		System.out.println("a = "+a+", d =  "+d); // a = 3, d = 4 
		a=++d; // a = d + 1 = 5, d = d + 1 = 5
		System.out.println("a = "+a+", d =  "+d); // a = 5, d = 5 
		a=d--; // a = d = 5, d = d - 1 = 4
		System.out.println("a = "+a+", d =  "+d); // a = 5, d = 4
		a=--d; // a = d - 1 = 3, d = d - 1 = 3
		System.out.println("a = "+a+", d =  "+d); // a = 3, d = 3
	}
}
