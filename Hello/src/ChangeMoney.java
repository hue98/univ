import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); 
		int unit[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; // 원 단위 생성
		
		System.out.print("Input price(won) : "); // 입력 
		
		try // 정수 확인 예외 처리
		{
			int money = scanner.nextInt();
			System.out.println();
			for (int in = 0; in < unit.length; in++) // 반복문을 이용하여 입력 돈을 각 단위로 나누
			{
				if(money/unit[in] != 0) // 각 단위 필요 유무 확인
					{
					System.out.println(unit[in] + "원 : " + money/unit[in]);
					money %= unit[in];
					}
			}
		} catch (InputMismatchException e) // integer가 아닐 시 실행
		{
			System.out.println("It is not integer");
		}
	}

}
