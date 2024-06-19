package Files;

import java.io.File;

public class DirectoryCreateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File directory=new File("C:\\Files\\File-Handling\\DirectoryDir");
		if(directory.mkdir())
		{
			System.out.println("Directory created:"+directory.getName());
		}
		else {
			System.out.println("Failed to create directory");
			
		}
		

	}

}
