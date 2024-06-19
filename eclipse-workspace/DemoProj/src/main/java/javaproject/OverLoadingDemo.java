package javaproject;

public class OverLoadingDemo {
	static int val1=34,val2=56,sum;
	
	//Method with no arguments
	static int sum() {
		System.out.println(sum);
		return (val1+val2);
	}
	static int sum(int a,int b) {
		return (a+b);
	}
	static void main(String[] args) {
		//overloading Demo
		sum();
		
	}
}
