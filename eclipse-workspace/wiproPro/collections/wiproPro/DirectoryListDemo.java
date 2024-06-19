package wiproPro;
import java.io.File;
public class DirectoryListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File dir=new File("C:\\Users\\Administrator\\Documents\\Virtual Machines\\Ubuntu 64-bit");
		
		File[] fileslist=dir.listFiles();
		if(fileslist!=null)
		{
			for(File file:fileslist)
		
		
		{
			System.out.println(file.getName());
		}
		}
	
		
		else {
			System.out.println("Directory does not exist");
			
			
		}
		
	}

}
