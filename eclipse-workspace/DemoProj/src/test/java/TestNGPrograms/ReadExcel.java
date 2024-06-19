package TestNGPrograms;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ReadExcel {
	
		
		@Test
		public void readData() throws FileNotFoundException
		{
			//Read data from excel - specify the path
			FileInputStream fis = new FileInputStream("C:\\Automation Session\\Anantha.xlsx");
			
			//Identify the workbook in excel sheet
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				//workbook.getSheetAt(0);//fine with number
				XSSFSheet sheet = workbook.getSheet("Selenium");
				int rows = sheet.getPhysicalNumberOfRows();//returns the total count of recors
				System.out.println(rows);
				
				//total no of columns
				int columns = sheet.getRow(1).getPhysicalNumberOfCells();
				System.out.println(columns);
				//print the cells
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<columns;j++)
					{
						String cellData = sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.print(cellData+"  ");
					}
					System.out.println();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

	}
