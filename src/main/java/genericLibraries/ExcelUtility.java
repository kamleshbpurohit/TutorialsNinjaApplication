package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class contains reusable methods with respect to excel
 * @author Kamlesh B
 *
 */
public class ExcelUtility
{
	private Workbook wb;
	
	/**
	 * This method is used to initialize excel file
	 * @param excelpath
	 */
	public void excelInitialization(String excelpath)
	{
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(excelpath);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			 wb = WorkbookFactory.create(fis);
		} 
		catch (EncryptedDocumentException | IOException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to read data from excel in the form of key-value pairs
	 * @param sheet
	 * @return
	 */
	public Map<String, String> readData(String sheet)
	{
		Map<String, String> map=new HashMap<>();
		Sheet sh = wb.getSheet(sheet);
		for(int i=0; i<=sh.getLastRowNum(); i++)
		{
			Cell c=sh.getRow(i).getCell(0);
			Cell c1=sh.getRow(i).getCell(1);
			String key = c.getStringCellValue();
			if(key.equals("####"))
				break;
			String value = c1.getStringCellValue();
			map.put(key, value);
			
		}
		return map;
	}
	
	/**
	 * This method is used to close the workbook
	 */
	public void closeWorkbook()
	{
		try
		{
			wb.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
