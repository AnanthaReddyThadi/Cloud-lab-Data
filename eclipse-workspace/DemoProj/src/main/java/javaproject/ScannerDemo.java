package javaproject;
import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=scan.nextLine();
		
		System.out.println("Hello"+name+"!");
		{
		System.out.println("enter your age:");
		int age=scan.nextInt();
		System.out.println(age);
		scan.close();
		
		
//		{
//		catch (Exception e)
		
//	}
		System.out.println("Invalid input data .....plss Enter trhevalid data");
    

		}
	}
}
