// ex 2-3. 타입 변환
public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		
		// b(byte)가 int로 자동 변환, 작은 것-> 큰 것 자동 변환
		System.out.println(b+i);	// 출력 : 227
		
		// 정수의 나누기이므로 결과도 정수
		System.out.println(10/4);	// 출력 : 2 
		
		// 10.0 (double), 4(integer) 연산, integer-> double 자동 변환
		// 4가 4.0으로 자동 변환. 실수의 나누기 실수
		System.out.println(10.0/4);  // 2.5 
	
		// 강제 타입 변환 : 4바이트 -> 2바이트  
		// 1234 (앞 2바이트)는 제외하고 0041만 변환하면 'A' 
		System.out.println((char)0x12340041); // A 
		
		// 227(10) = 0000 0000 1110 0011
		// byte(1바이트)로 변환되며 1110 0011 만 남음 
		// 부호부 (첫번째 비트)가 1이므로 0001 1100 -> 0001 1101 -> 29 -> -29 
		System.out.println((byte)(b+i));	// -29 
		
		// 2.9가 int 2로 변환되었다가 1.8과 연산 위해 다시 2.0으로 
		System.out.println((int)2.9 + 1.8);	// 3.8 
		
		System.out.println((int)(2.9 + 1.8));	// 4
		
		System.out.println((int)2.9 + (int)1.8);	// 3 
		}
}
