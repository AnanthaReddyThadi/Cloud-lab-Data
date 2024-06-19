package Files;
import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileName =new File("C:\\Users\\Administrator\\Desktop\\GIT Assignmentsr");
		try
		{
			if (fileName.createNewFile())
			{
				
				System.out.println("File created: "+fileName.getName());
				
		    }
		}
			catch (IOException e) {
				//ToDo Auto-generated catch block
				System.out.println("An error occurred");
				e.printStackTrace();
				
			
				
			}
		finally
		{
			System.out.println("Execution Completed");
		}
		
		}
	}

