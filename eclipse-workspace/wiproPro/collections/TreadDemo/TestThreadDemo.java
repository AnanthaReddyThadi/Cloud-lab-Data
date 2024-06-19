package TreadDemo;
class ThreadDemo extends Thread
{
	private Thread t;
    private String threadName;
    ThreadDemo(String name)
    
    {
    	threadName=name;
    	System.out.println("crating"+threadName);
    	
    	
    	 	  	
    }
    // run methode
    public void run()
    {
    	System.out.println("Running " +threadName);
    	try
    	{
    		for (int i=3;i>0;i--)
    		{
    			System.out.println("Thread "+threadName+" Interrupted "+", "+i);
    			Thread.sleep(1000);
    			
    		}
    	}
    	
    		catch(InterruptedException e)
    		
    		{
    			System.out.println("Thread"+threadName+"Interrupted");
    			
    		}
    	System.out.println("Thread"+threadName+"Existing");
    	 
    	}
    public void start() {
    	System.out.println("Starting"+ threadName);
    	if(t==null)
    	{ 
    		t=new Thread(this,threadName);
    		t.start();
    		
    		
    	}
   
    	
    }
    
    	
    }
     

public class TestThreadDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1=new ThreadDemo("Thread->1");
		t1.start();
		ThreadDemo t2=new ThreadDemo("Thread->2");
		t2.start();
		

	}

}
