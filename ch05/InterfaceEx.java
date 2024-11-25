package ch05;

//인터페이스 선언 
interface PhoneInterface {	
	final int TIMEOUT = 10000;	// 상수 필드 선언 
	void sendCall();	// 추상 메소드
	void receiveCall();	// 추상 메소드 
	default void printLogo() {	// default 메소드 
		System.out.println("** Phone **");
	}
}

//인터페이스 구현  
class SamsungPhone implements PhoneInterface {	
	
	// 추상 메소드
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	
	// 추상 메소드
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	
	// 추가 메소드 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone(); // 객체 생성
		phone.printLogo();	// ** Phone **
		phone.sendCall();	// 띠리리리링
		phone.receiveCall();	// 전화가 왔습니다.
		phone.flash();		// 전화기에 불이 켜졌습니다.
	}
}
