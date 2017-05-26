package cyl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Deme2{
	public static void main(String[]args){
		SimpleDateFormat sd =new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		System.out.println(sd.format(new Date()));
	}
}