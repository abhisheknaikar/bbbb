
public class demo3 extends Thread{

	public void run()
	{
		try {
			System.out.println("Addition activity started");
			int a=10;
			int b=20;
			Thread.sleep(4000);
			int c=a+b;
			System.out.println(c);
			System.out.println("Addition activity completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
