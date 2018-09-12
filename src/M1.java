//	import java.lang.*;
class MyThread extends Thread  {
	public  void run()
	{
		System.out.println("bb");
		yield();
		yield();
		System.out.println("bbc");
		
		try
		{
	
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		System.out.println("hi  teju");
		}
		
		System.out.println("b");
	}

}
class main
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		//t.setDaemon(true);
		t.start();
		System.out.println("main thread");

	}
		
}

