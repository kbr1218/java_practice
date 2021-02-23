package jump2java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
	
	public static void main21(String[] args) { //main21
		System.out.println(Util.getCurrentDate("yyyyMMdd"));
	}

}
