package assign;

public class Phone {
	
	public String name; 
	public String num;		// 123-4567 '-'가 있어 문자열로 선
	
	public Phone(String name, String num) {		// 이름, 전화번호 construct 생성
		this.name = name;
		this.num = num;
	}
	public static String phoneName(Phone r) {
		return r.name;
	}
	public static String phoneNum(Phone r) {
		return r.num;
	}
}
