import java.util.Scanner;

public class AttendancePoint {

	public static void main(String[] args) {
		
		// Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 첫 번째 학생 정보 입력 
		System.out.print("학생 1 >> ");
		String name1 = scanner.next();
		int late1= scanner.nextInt();
		int absent1 = scanner.nextInt();
		
		// 두 번째 학생 정보 입력
		System.out.print("학생 2 >> ");
		String name2 = scanner.next();
		int late2= scanner.nextInt();
		int absent2 = scanner.nextInt();

		scanner.close(); 
		
		// 첫 번째 학생 감점, 출결 점수 계산 
		int penalty1 = late1 * 3 + absent1 * 8;
		int score1 = 100 - penalty1;

		// 두 번째 학생 감점, 출결 점수 계산
		int penalty2 = late2 * 3 + absent2 * 8;
		int score2 = 100 - penalty2;
		
		// 결과 출력 
		System.out.print(name1 + "의 감점은 " + penalty1 + ". ");
		System.out.println(name2 + "의 감점은 " + penalty2 + ".");
		
		// 점수 비교
		if (score1>score2) {
			System.out.print(name1 + "의 출석점수가 더 높음. ");
			System.out.println(name1 + "의 출석 점수는 " + score1 + ".");
		} 
		
		else if (score1<score2) {
			System.out.print(name2 + "의 출석점수가 더 높음. ");
			System.out.println(name2 + "의 출석 점수는 " + score2 + ".");
		} 
		
		else {
			System.out.println("점수 동일");
		};	
	}
}
