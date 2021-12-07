package Excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Browser.browser;

public class excelone extends browser{

	public XSSFWorkbook workbook;
	public XSSFSheet sheet;

	public void datadriven(String sheetname) throws Exception
	{
	workbook =new XSSFWorkbook("C:\\Users\\ephron\\Documents\\datadriven.xlsx");
	sheet=workbook.getSheet(sheetname);
	}
	

	
}
