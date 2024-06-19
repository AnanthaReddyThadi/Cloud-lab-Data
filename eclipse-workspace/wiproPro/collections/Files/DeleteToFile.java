package Files;

import java.io.File;


public class DeleteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File FF=new File("C:\\Files\\File-Handlingsg");
		if(FF.delete())
		{
			System.out.println(FF.getName()+"file is deleted");
			
		}
		else
			{
				System.out.println("Unexpected the Erorr Occurence");
			}
	}
}



