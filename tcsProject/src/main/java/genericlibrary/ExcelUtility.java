package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public static String getCellData(String sheetName,int rowNum, int cellNum) throws EncryptedDocumentException, IOException  {
		
		
		//step:1 get the java representation of physical file
		FileInputStream fis=new FileInputStream("./src/test/resources/testData/RegisterEmail.xlsx");
		//step:2 create a workbook
		Workbook workBook=WorkbookFactory.create(fis);
		//step:3 get the sheet from the work book
		Sheet sheet=workBook.getSheet(sheetName);
		//step:4
		Row row=sheet.getRow(rowNum);
		//step:5 get the cell from the given row
		Cell cell=row.getCell(cellNum);
		
		String data=cell.getStringCellValue();
		 return data;
		}
		
	 public static String[] [] getRowData(String sheetName) throws EncryptedDocumentException, IOException{
		 //step 1
		 FileInputStream fis=new FileInputStream("./src/test/resources/testData/RegisterEmail.xlsx");
		 //step 2
		 Workbook workBook=WorkbookFactory.create(fis);
		 //step 3
		 Sheet sheet=workBook.getSheet(sheetName);
		 //step 4
		 int rowCount=sheet.getPhysicalNumberOfRows();
		 //step 5
		 int columnCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		 String[] [] data=new String[rowCount-1] [columnCount];
		 
		 for(int i=1;i<rowCount;i++) {
			 for(int j=0; j<columnCount;j++) {
				 data[i-1] [j]=sheet.getRow(i).getCell(j).toString();
			 }
		 }
		  return data;
	 }
} 
		 
		 


