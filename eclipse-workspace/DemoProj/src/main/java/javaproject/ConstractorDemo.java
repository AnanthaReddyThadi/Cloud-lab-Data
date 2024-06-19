package javaproject;

public class ConstractorDemo {
	static int num;
	//Constroctor Demo -> No return type cond
	public ConstractorDemo() {
		num=10;
	}
		public ConstractorDemo(int res) {
			num=res;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the project 
		ConstractorDemo cd1=new ConstractorDemo();
		System.out.println(cd1.num);
		/*ConstractorDemo cd2=null;
		System.out.println(null);*/
		ConstractorDemo cd2=new ConstractorDemo(25);
		System.out.println(num);

	}

}
