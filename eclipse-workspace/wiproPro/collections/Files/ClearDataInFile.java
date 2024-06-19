package Files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ClearDataInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		(RandomAccessFile raf = new RandomAccessFile("C:\\Program Files\\MySQL","rw"))

		{
			 raf.setLength(0);
			 } 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
		e.printStackTrace();
		}

	}

}
