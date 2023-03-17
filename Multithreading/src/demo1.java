import java.util.Scanner;

public class demo1 extends Thread{

	public void run()
	{
		try {
			System.out.println("Banking activity started");
			Scanner scan = new Scanner(System.in);
			System.out.println("enter account number");
			int acct = scan.nextInt();
			System.out.println("enter password");
			int pswr = scan.nextInt();
			Thread.sleep(5000);
			System.out.println("collect your money");
			System.out.println("Banking activity completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
