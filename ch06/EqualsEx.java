package ch06;

class Rect{
	private int width;
	private int height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	// 면적이 같으면 두 Rect 객체가 같은 것으로 판별
	public boolean equals(Object obj) {
		Rect p = (Rect)obj;
		if (width*height == p.width*p.height)
			return true;
		else
			return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Rect d = new Rect(2,3);
		Rect e = new Rect(3,2);
		Rect f = new Rect(3,4);
		
		if(d.equals(e))
			System.out.println("d is equal to e");
		if(d.equals(f))
			System.out.println("d is equal to f");
		if(e.equals(f))
			System.out.println("e is equal to f");
	}
}
