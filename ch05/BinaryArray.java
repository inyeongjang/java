package ch05;

import java.util.Scanner;

// 정수를 배열로 저장하는 클래스 BaseArray 
class BaseArray{
	protected int array [];			// 배열
	protected int nextIndex = 0;	// 다음 삽입할 배열 인덱스 
	public BaseArray(int size) {	// 생성자
		array = new int [size];
	}
	public int length() {return array.length;}		// lentgh() 메소드 : 배열 크기 반환 
	public void add(int n) {						// add() 메소드 : 배열 요소 추가 
		if(nextIndex==array.length) return;			// nextIndex가 array.length이면 종료 
		array[nextIndex] = n;						// 배열에 정수를 저장하고 nextIndex 증가 
		nextIndex++;	
	}
	public void print() {							// print() 메소드 : 배열 요소 출력 
		for(int n : array) System.out.print(n+"");	
		System.out.println();
	}
}

// BaseArray 클래스를 상속 받아 임계값(threshold)보다 크면 1, 아니면 0의 값을 가지는 BinaryArray
public class BinaryArray extends BaseArray {
	
	private int threshold;	// 필드 threshold 
	
	public BinaryArray(int size, int threshold) {	// 생성자 - 파라미터가 2개 
		super(size);		// 수퍼 클래스 생성자 
		this.threshold = threshold;
	}
	
	@Override
	public void add(int n) {
		if(n>threshold) {
			super.add(1);
		}
		else {
			super.add(0);
		}
	}

	public static void main(String[] args) {
		int threshold = 50;										// 임계값 threshold
		BinaryArray bArray = new BinaryArray(10, threshold);	// BinaryArray 객체 bArray 생성
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		for(int i=0; i<bArray.length(); i++) {					// 정수를 입력 받아 배열 요소 추가 -> BaseArray의 add 메소드 
			int n = scanner.nextInt();
			bArray.add(n);
		}
		bArray.print();											// 배열 출력 -> BaseArray의 print 메소드 
		scanner.close();
	}
}