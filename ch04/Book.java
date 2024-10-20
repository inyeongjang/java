// ex 4-4. 생성자 선언 및 활용 연습
// 제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스를 작성하고, 생성자를 작성하여 필드를 초기화하라

public class Book {
	
	String title;
	String author;
	
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public Book(String t) {
		this.title = t;
		this.author = "작자미상";
	}
	
	public static void main(String[] args) {
		Book littleprince = new Book("어린왕자 ", "생텍쥐페리");
		Book loveStory = new Book("춘향전 ");
		
		System.out.println(littleprince.title + littleprince.author);
		System.out.println(loveStory.title + loveStory.author);
	}
}
