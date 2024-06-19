package Files;
import java.io.FileReader;


public class ReadToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //create an array of charector
		char[] array=new char[100];
		try {
			// CVreate a reader using fileReader
			FileReader input=new FileReader("C:\\Files\\File-Handling ");
			//Read Charectar
			input.read(array);
			System.out.println("The data in the file ");
			System.out.println(array);
			//Close the Reader
			input.close();

			System.out.println("The data in the file ");

		}
		catch(Exception e) {
			e.getStackTrace();
			
		}

	}

}



//FileReader reader=new FileReader("C:\\Files\\File-Handling");
//int c;
//while(c=reader=read()!=-1)
//	
//{
//	char ch=(char) c;
//	System.out.println(ch);
//	
//}

