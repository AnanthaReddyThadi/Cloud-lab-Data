package Designpattern;


import java.awt.List;
import java.util.ArrayList;

public class NongenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add(123);//no error
		
		for(Object obj: list)
		{
			String str = (String) obj;
			System.out.println(str);
		}
	}

	

}
