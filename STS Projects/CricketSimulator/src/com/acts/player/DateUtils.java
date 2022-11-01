package com.acts.player;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static final String DD_MM_YYYY = "dd/MM/yyyy";
	public static final String MM_DD_YYYY = "MM/dd/yyyy";
	
	public static Date getDate(String strDate, String pattern) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.parse(strDate);
	}

	public static String getFormattedDate(Date date, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}
}
