package Wiproj_Maven.Wiproj_Maven;

import java.util.ArrayList;
import java.util.List;

public class GenaricExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList();
		list.add("Hello");
		list.add(" 12345");//no error
		
		for(Object obj: list)
		{
			String str = (String) obj;
			System.out.println(str);
		}
	}


}
