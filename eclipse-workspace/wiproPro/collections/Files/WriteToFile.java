package Files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter("C:\\Files\\File-Handlings");
		
		writer.write("we are doing good in SDET");
		writer.write("..online training is going on quite well");
		writer.close();
		System.out.println("Code Written Successfully");
		
		
		

	}

}
