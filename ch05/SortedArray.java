package ch05;

import java.util.Scanner;

//정수를 배열로 저장하는 클래스 BaseArray 
class BaseArray{
	protected int array [];			// 필드1) 배열  
	protected int nextIndex = 0;	// 필드2) 다음 삽입할 배열 인덱스  
	public BaseArray(int size) {	// 생성자) 반드시 size 값을 파라미터로 넣어야 함. 
		array = new int [size];
	}
	public int length() {return array.length;}		// 메소드1) length(): 배열 크기 반환 
	public void add(int n) {						// 메소드2) add(): 배열 마지막에 요소 추가 
		if(nextIndex==array.length) return;				// nextIndex가 array.length이면 종료 
		array[nextIndex] = n;							// 배열에 정수를 저장하고 nextIndex 증가 
		nextIndex++;	
	}
	public void print() {							// 메소드3) print(): 전체 배열 요소 출력 
		for(int n : array) System.out.print(n+" ");	
		System.out.println();
	}
}

// BaseArray 클래스를 상속 받아 값이 큰 순서로 배열을 항상 유지하는 SortedArray
public class SortedArray extends BaseArray {
	
	public SortedArray(int size) {	// 생성자 
		super(size);				// 수퍼 클래스 생성자 
	}
	
	@Override									// add() -> 메소드 오버라이딩 
	public void add(int n) {
		
		super.add(n);							// 새로운 요소를 배열 마지막에 추가 
		
		for (int i=nextIndex-1; i>0; i--) {		// 뒤에서부터 비교
			if (array[i] > array[i-1]) {		// 뒤 요소가 더 크다면 자리 바꾸기 
				int temp = array[i];
				array[i] = array[i-1];
				array[i-1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		
		SortedArray sArray = new SortedArray(10);	// SortedArray 객체 sArray 생성 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		
		for(int i=0; i<sArray.length(); i++) {		// length() 메서드 아용 
			int n = scanner.nextInt();				
			sArray.add(n);							// add() 메서드 이용하여 입력 받은 정수를 배열에 저장 
		}
		sArray.print();								// BaseArray의 print() 메서드 이용 
		
		scanner.close();
	}
}
