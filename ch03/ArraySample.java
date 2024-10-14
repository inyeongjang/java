import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// ex 3-7. 배열에 입력 받은 수 중 제일 큰 수 찾기
		// 양수 5개를 입력 받아 배열에 저장하고 제일 큰 수 출력 
				
		int NumArray[] = new int[5];
				
		int max = 0;
				
		System.out.print("양수 5개를 입력하세요: ");
				
		for (int i=0; i<NumArray.length; i++) {
				NumArray[i] = scanner.nextInt();
				if(NumArray[i] > max) {max=NumArray[i];}
			}
				
		System.out.println("가장 큰 수: "+max);		
		
		
		
		// ex 3-8. 배열 원소의 평균 구하기 
		// 배열 크기만큼 정수 입력 받고 평균 구하기
		
		int intArray [] = new int[5];
		
		int sum = 0;
		
		System.out.print("양수 5개를 입력하세요: ");
		
		for (int i=0; i<intArray.length; i++) {
			intArray[i]=scanner.nextInt();
			sum+=intArray[i];
		}
				
		System.out.println("평균 : " + sum/intArray.length);
		
		scanner.close();
		
		
				
		// ex 3-9. for-each문 활용 
		
		enum Week {월, 화, 수, 목, 금, 토, 일}
		int [] n = {1, 2, 3, 4, 5};
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
		
		int total = 0;
		for (int k : n) {
			System.out.print(k + " ");
			total+=k;
		}
		System.out.println("합은 "+total);
		
		for (String s : names) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (Week day : Week.values()) {
			System.out.print(day + "요일 ");
		}
		System.out.println();
		
		

		// 연습 1. 10개의 정수를 저장하는 배열 tenArray 선언 & 생성
		int tenArray [] = new int [10];
		
		// 연습 2. tenArray의 크기 
		System.out.println(tenArray.length);
		
		// 연습 3. tenArray에 1~10 저장, 모든 원소의 합 출력
		sum = 0;
		for (int i = 0; i < tenArray.length; i++) {
			tenArray[i] = i+1;
			sum += tenArray[i];
		}
		System.out.println(sum);
		// 다른 방법) for (int i:tenArray) {sum+=i;}
		// 다른 방법) int tenArray[] = {1,2,3,4,5,6,7,8,9,10};

		
		
		// ex 3-10. 2차원 배열로 4년 평점 구하기
		// 2차원 배열에 학년별로 1,2학기 성적 저장하고 4년간 전체 평점 평균 출력
		double score[][] = {{4.3, 4.5}, {4.0, 4.1}, {3.8, 3.5}, {4.2, 4.4}};
		double add = 0;
		
		/*for (int i=0; i<score.length; i++) {
			for (double s : score[i]) {
				add += s;
			}
		}*/
		
		for (int year=0; year<score.length; year++) {
			for (int term=0; term<score[0].length; term++) {
				add += score[year][term];
			}
		}
		
		// 연산할 때 double로 변환 
		double avg = add/(score.length*score[0].length);
		System.out.println("전체 평점 평균: "+avg);
		
		
		
		// ex 3-11. 비정방형 배열의 생성과 접근 
		int intArr [][] = new int[4][];
		intArr[0] = new int[3]; 
		intArr[1] = new int[2];
		intArr[2] = new int[3];
		intArr[3] = new int[2];
		
		for (int i=0; i<intArr.length; i++) {
			for (int j=0; j<intArr[i].length; j++) {
				intArr[i][j] = (i+1)*10 + j;
				System.out.print(intArr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		// ex 3-12. 배열 리턴
		// 정수 4개를 가지는 일차원 배열을 생성하고 1,2,3,4로 초기화한 다음, 
		// 배열을 리턴하는 makeArray()를 작성하고, 이 메소드로부터 배열을 전달받아 값을 출력하는 프로그램
		int numArr [];
		numArr = makeArray();
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}
	
	static int [] makeArray() {
		int temp [] = new int[4];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i+1;
		}
		return temp;
	}

}
