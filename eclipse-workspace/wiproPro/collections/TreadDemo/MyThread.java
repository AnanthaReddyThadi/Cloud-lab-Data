package TreadDemo;

 
class TestThread extends Thread
{
	public void run()
	{
		
	

	System.out.println("Thread is running");
	}
}

public class MyThread {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TestThread t1=new TestThread();
		t1.start();
		
		
	}

}
