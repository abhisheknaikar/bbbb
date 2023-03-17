
public class demo2 extends Thread{

	public void run()
	{
		try {
			System.out.println("Printing activity started");
			for(int i=1;i<=5;i++)
			{
				System.out.println("abhishek");
				Thread.sleep(5000);
			}
				System.out.println("Printing activity completed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
