import java.util.InputMismatchException;
import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int unit[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("Input price(won) : ");
		
		try
		{
			int money = scanner.nextInt();
			System.out.println();
			for (int in = 0; in < unit.length; in++)
			{
				if(money/unit[in] != 0)
					{
					System.out.println(unit[in] + " ₩ : " + money/unit[in]);
					money %= unit[in];
					}
			}
		} catch (InputMismatchException e)
		{
			System.out.println("It is not integer");
		}
	}

}
