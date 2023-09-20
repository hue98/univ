import java.util.Scanner;

public class Simple369 {

	public static void main(String[] args) {
		String ans;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter integer value 1~99 : ");
		int num = scanner.nextInt();
		if((num/10) % 3 == 0 || (num%10) % 3 == 0) {
			if((num/10) % 3 == 0 && (num%10) % 3 == 0) {
				ans = "박수짝짝";	
			}
			else {
				ans = "박수짝";
			}
		}
		else {
			ans = "no 3, 6, or 9";
		}
		System.out.println("" + ans);
		
		scanner.close();
	}

}
