package UtilityPacjages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public static int getRandomNum()
	{
		Random ran=new Random();
		int r = ran.nextInt(100);
		return r;
	}
	
	public static String getSystemDate()
	{
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("YYYY-MM-DD");
		String startform = sim.format(dateobj);
		return startform;
	}
	
	public static String getRequiredDate( int n)
	{
		Date dateobj=new Date();
		SimpleDateFormat sim=new SimpleDateFormat("YYYY-MM-DD");
		String startform = sim.format(dateobj);
		
		Calendar cal=sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, n);
		String Enddate = sim.format(cal.getTime());
		return Enddate;
	}
	
	

}
