package org.soft.oa.product.utlis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class StringToData {
	public static Date parseTimeFormattoDayDate(String date) {
		Date time = null;
		try {
			Locale locale = new Locale("en", "US", "WIN");
		    Locale.setDefault(locale);
			time = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return time;
	}
}
