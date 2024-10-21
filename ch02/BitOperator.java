// ex 2-9. 비트 논리 연산과 비트 시프트 연산

public class BitOperator{
	
	public static void main(String[] args) {
		
		short a = (short)0x55ff; // 16진수 55ff
		short b = (short)0x00ff; // 16진수 00ff
		
		// 비트 논리 연산
		
		System.out.println("[비트 연산 결과]");
		
		/* printf("%04x\n") : 4자리 16진수 형식으로 출력, 빈자리에 0 삽입, 소문자 */
		
		System.out.printf("%04x\n", (short)(a&b));
		// 0x 55ff = 0b 0101 0101 1111 1111
		// 0x 00ff = 0b 0000 0000 1111 1111
		//              0000 0000 1111 1111 -> 00ff 
		
		System.out.printf("%04x\n", (short)(a|b));
		// 0x 55ff = 0b 0101 0101 1111 1111
		// 0x 00ff = 0b 0000 0000 1111 1111
		//              0101 0101 1111 1111 -> 55ff 
		
		System.out.printf("%04x\n", (short)(a^b));
		// 0x 55ff = 0b 0101 0101 1111 1111
		// 0x 00ff = 0b 0000 0000 1111 1111
		//              0101 0101 0000 0000 -> 5500
		
		System.out.printf("%04x\n", (short)(~a));
		// 0x 55ff = 0b 0101 0101 1111 1111
		//              1010 1010 0000 0000 -> aa00 
		
		
		byte c = 20;
		byte d = -8;
		
		// 비트 시프트 연산 
		 
		System.out.println("[비트 연산 결과]");
		
		System.out.println((short)(c<<2));  // 20*4=80
		// 20 -> 0001 0100 
		//       0101 0000 -> 80
		
		System.out.println((short)(c>>2));  // 20/4=50
		// 20 -> 0001 0100 
		//       0000 0101 -> 5 
		
		System.out.println((short)(d>>2));  // -8/4=-2
		// 8 -> 00001000
		// (보수) -8 -> 11111000 -> 11111110
		//                         00000010 -> 2, 따라서 -2 
		
		System.out.printf("%x\n",(d>>>2)); 
		// -8 -> 11111110
		//       00111111 -> 00000001 -> 2, 따라서 -2 
		
	}
}
