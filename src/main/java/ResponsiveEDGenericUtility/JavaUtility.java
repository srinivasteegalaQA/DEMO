package ResponsiveEDGenericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumber()
	{
		Random r=new Random();
		int value = r.nextInt(10000);
		return value;	
	}
	
	public String getSystemDate()
	{
		 Date d = new Date();
		 String value = d.toString();
		 return value;
	}
	
	public String getSystemDateformat()
	{
		Date d = new Date();
		String darr[]=d.toString().split(" ");
		String date = darr[2];
		String month = darr[1];
		String year = darr[5];
		String time = darr[3].replace(":", "-");
		String dateFormat=date+"_"+month+"_"+year+"_"+time;
		return dateFormat;
		
	}
}
