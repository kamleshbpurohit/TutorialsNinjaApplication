package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * This class contains reusable methods for the actions performed on Properties File
 * @author Kamlesh B
 *
 */
public class PropertyFileUtility 
{
	Properties p;
	
	/**
	 * This method is used to initialize properties file
	 * @param filepath
	 */
	public void propertyConfig(String filepath)
	{
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(filepath);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		p = new Properties();
		try
		{
			p.load(fis);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	/**
	 * This method is used to fetch the value from Properties file based on key
	 * @param key
	 * @return
	 */
	public String fetchProperty(String key)
	{
		return p.getProperty(key);
	}
	
	/**
	 * This method is used to write data into properties file
	 * @param key
	 * @param value
	 * @param filepath
	 * @param message
	 */
	public void setDataToProperties(String key, String value, String filepath, String message)
	{
		p.put(key, value);
		try
		{
			p.store(new FileOutputStream(filepath), message);
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
