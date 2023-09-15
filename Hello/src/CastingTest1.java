
public class CastingTest1 {

	public static void main(String[] args) {
		byte b = 120; // 1바이트
		int i = b; // 4바이트
		
		System.out.println("확대 형 변환 : " + i);
		
		int j = 259; // 4바이트
		double d = 259.428; // 8바이트
		System.out.println("축소 형 변환 결과");
		b = (byte) j;
		System.out.println("int 259를 byte로 : " + b);
		i = (int) d;
		System.out.println("double 259.428을 int로 : " + i);
		b = (byte) d;
		System.out.println("double 259.428을 byte로 : " + b);

	}

}
