package Files;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;


public class NioFileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path=Paths.get("C:\\Files\\iFile-Handling");
		//creating write to the file
		
		String content="We are learning ....new Addition";
		try
		{
			Files.write(path,content.getBytes());
			System.out.println("File Written"+path);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		//read from a file
		String fileContant;
		try
		{
			fileContant=Files.readString(path);
			System.out.println("FIle Contant:"+fileContant);
			
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}

}
