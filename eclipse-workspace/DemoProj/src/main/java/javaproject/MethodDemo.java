package javaproject;

public class MethodDemo {
	static void met1()
	{
		System.out.println("Method->1 is executed");
		
		
	}
	void met2() {

		System.out.println("Method->2 is executed");
		
	}
	int holiday=5;
	String garden="Rose";
	int met3()
	{
		System.out.println("Method ->3 is executed..next holiday is four");
		return holiday;//last Statement
	}
	
	public static void main(String[] args) {
		met1();
		MethodDemo md=new MethodDemo();
		md.met2();
		met1();
		md.met3();		
	}

}
