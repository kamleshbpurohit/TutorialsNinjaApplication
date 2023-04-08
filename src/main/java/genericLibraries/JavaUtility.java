package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains reusable java methods
 * @author Kamlesh B
 *
 */
public class JavaUtility
{
	/**
	 * this method generates random number within the limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit)
	{
		Random random=new Random();
		int randomnum=random.nextInt(limit);
		return randomnum;				
	}
	
	/**
	 * This method returns current time in specified format
	 * @return
	 */
	public String getCurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_mm_yy_hh_min_ss");
		String currentTime = sdf.format(date);
		return currentTime;
	}

}
