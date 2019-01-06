package DataAccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataDriven
{

	public static String[][] DataAccess() throws IOException
	//public static void main(String[] arg) throws IOException
	{	
		File dataFile = new File("E:\\Java And Selenium Setup\\Code\\HybridFramework\\src\\DataFile.xls");
		FileInputStream fi = new FileInputStream(dataFile);
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		
		//System.out.println("hi");
		
		HSSFSheet sh = wb.getSheetAt(0);
		//System.out.println("hello");
		HSSFRow row = sh.getRow(0);
	
		System.out.println("data");
		
		int rc = sh.getPhysicalNumberOfRows();
		int cc = row.getPhysicalNumberOfCells();
	
		
		String data[][]= new String[rc][cc];
				
		for(int i=1;i<rc;i++)
		{
			HSSFRow rowno = sh.getRow(i);
			for(int j=0;j<cc; j++)
			{
				HSSFCell cellno = rowno.getCell(j);
				System.out.print(cellno.getStringCellValue()+"\t");
				data[i-1][j] = cellno.getStringCellValue();
			}
			System.out.println("\n");
			
		}
		
		return data;
	}

	
	
	public String[][] getEnVariable(String Sheet, String Key) throws IOException
	{	
		File dataFile = new File("E:\\Java And Selenium Setup\\Code\\HybridFramework\\src\\DataFile.xls");
		FileInputStream fi = new FileInputStream(dataFile);
		HSSFWorkbook wb = new HSSFWorkbook(fi);
		HSSFSheet sh = wb.getSheet(Sheet);
		HSSFRow row = sh.getRow(0);
		
		int rc = sh.getPhysicalNumberOfRows();
		int cc = row.getPhysicalNumberOfCells();

		String data[][]= new String[rc][cc];

		
		HSSFRow rowno = sh.getRow(0);
			for(int j=0;j<cc; j++)
			{
				HSSFCell cellno = rowno.getCell(j);
				System.out.print(cellno.getStringCellValue()+"\t");
				
				data[0][j] = cellno.getStringCellValue();
				
				
			}
			System.out.println("\n");
			
			return data;
			
		}
	
	}


