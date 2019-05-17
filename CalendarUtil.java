/**
 * Copyright � American Airlines 2016 - FlightNeoFeeder
 * @author 660499 - Aug 2, 2016
 *
 */
package com.aa.apauto.connectme.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author 660499
 *
 */
public class CalendarUtil 
{
	
	private static final Logger logger = LogManager.getLogger(CalendarUtil.class);

	public static Timestamp convertCSTCalendarToCSTTimestamp(Calendar fltCaldateTime)
	{
		convertCSTFHUBCalendarToCSTCalendar(fltCaldateTime);
		return Timestamp.valueOf(LocalDateTime.ofInstant(fltCaldateTime.toInstant(), ZoneId.of(Constants.CALENDAR_CST)));
	}
	
	public static Timestamp convertUTCCalendarToUTCTimestamp(Calendar fltCaldateTime)
	{
		convertUTCFHUBCalendarToUTCCalendar(fltCaldateTime);
		return Timestamp.valueOf(LocalDateTime.ofInstant(fltCaldateTime.toInstant(), ZoneOffset.UTC));
	}
	
	public static Calendar convertUTCFHUBCalendarToUTCCalendar(Calendar fltCaldateTime)
	{
		fltCaldateTime.setTimeZone(TimeZone.getTimeZone(Constants.CALENDAR_UTC));
		return fltCaldateTime;
	}
	
	public static Calendar convertCSTFHUBCalendarToCSTCalendar(Calendar fltCaldateTime)
	{
		fltCaldateTime.setTimeZone(TimeZone.getTimeZone(ZoneId.of(Constants.CALENDAR_CST)));
		return fltCaldateTime;
	}
	
	public static Date getLocalDateFromCalender(Calendar localCalendarDate)
	{
		SimpleDateFormat localDateFormatter = new SimpleDateFormat(Constants.DATE_FORMAT_DDMMYYYY);
		try 
		{
			return localDateFormatter.parse(localDateFormatter.format(localCalendarDate.getTime()));
		} catch (ParseException e) 
		{
			logger.error("Error Parsing Local Date for the Flight, Error ",e);
			return null;
		}
	}
	
	public static String convertDateToString(Date date, String dateFormat)
	{
		SimpleDateFormat dateFormatter = new SimpleDateFormat(dateFormat);
		return dateFormatter.format(date);
	}
	
	public static XMLGregorianCalendar getCurrentCSTTimeInGegorian()
	{
		try
		{
			GregorianCalendar gcal = GregorianCalendar.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
			return xcal;
		} catch (DatatypeConfigurationException e)
		{
			logger.error("Error creating XMLGegorialCalendar, Error=",e);
		}
		return null;
	}
	
	public static int convertAdjustmentToInt(Duration duration)
	{
		return (duration.getHours()*60 + duration.getMinutes())*duration.getSign();
	}
	
	public static Calendar addDateForCurrentGMT(int days)  
	{
		Calendar cal = Calendar.getInstance();
		long gmtOffsetInMilliSec = cal.getTimeZone().getOffset(cal.getTimeInMillis());
		gmtOffsetInMilliSec = gmtOffsetInMilliSec* -1;
		long currentTimeInMilliSec = cal.getTimeInMillis();
		currentTimeInMilliSec = currentTimeInMilliSec + gmtOffsetInMilliSec;
		cal.setTimeInMillis(currentTimeInMilliSec);
		cal.add(Calendar.DAY_OF_MONTH, days);
		return cal;
	}
	
	public static String addDaysForCurrentUTCDay(int days)  
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_TIME_FORMAT);
		return sdf.format(cal.getTime());
	}
	
	public static XMLGregorianCalendar addDateForCurrentXMLGregorianCalendar(int days) throws DatatypeConfigurationException  
	{
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		long gmtOffsetInMilliSec = cal.getTimeZone().getOffset(cal.getTimeInMillis());
		gmtOffsetInMilliSec = gmtOffsetInMilliSec* -1;
		long currentTimeInMilliSec = cal.getTimeInMillis();
		currentTimeInMilliSec = currentTimeInMilliSec + gmtOffsetInMilliSec;
		cal.setTimeInMillis(currentTimeInMilliSec);
		cal.add(Calendar.DAY_OF_MONTH, days);
		XMLGregorianCalendar calendar = DatatypeFactory.newInstance()
		        .newXMLGregorianCalendar(cal);
		return calendar;
	}
	
	 public static Timestamp getCurrentTimeStampInGMT()
	    {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		return Timestamp.valueOf(LocalDateTime.ofInstant(calendar.toInstant(), ZoneOffset.UTC));
	    }
	 
	 
	 public static Timestamp addHoursToTimeStampinGMT(int hours)
	    {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		calendar.add(Calendar.HOUR, hours);
		return Timestamp.valueOf(LocalDateTime.ofInstant(calendar.toInstant(), ZoneOffset.UTC));
	    }
	
	 public static Timestamp addMinutesToTimeStampinGMT(Timestamp timestamp, int minutes)
	    {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		calendar.setTimeInMillis(timestamp.getTime());
		calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		LocalDateTime ldt =LocalDateTime.ofInstant(calendar.toInstant(), ZoneOffset.UTC);
		System.out.println("LDT : "+ldt.toString());
		
	//	calendar.add(Calendar.MINUTE, minutes);
		return Timestamp.valueOf(LocalDateTime.ofInstant(calendar.toInstant(), ZoneOffset.UTC));
	    }	 
	 
	 
	 public static void main(String []args) {
		 
		 Timestamp ts = CalendarUtil.getCurrentTimeStampInGMT();
		 System.out.println(ts);
		 
		 Timestamp newTS = CalendarUtil.addMinutesToTimeStampinGMT(ts, 4);
		 System.out.println(newTS);
				 
	 }
		
}
