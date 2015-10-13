package com.myJava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class DateExample {
	private static byte[] MyBytes;
	public static void main(String[] args) {
		MyBytes = new byte[] {1,2,3};
		Arrays.toString(MyBytes);
		System.out.println(Arrays.toString(MyBytes));
		String str="VIPIN";
		char[] chars = str.toCharArray();
        StringBuffer strBuffer = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
        		System.out.println("the hex representation for "+ (i+1)+"th character "+chars[i]+" is: "+Integer.toHexString((int) chars[i]));
                 
        }
        
        byte[] keyBytes = new byte[]  {0x1c, 0x2e, (byte) 0xb4, (byte)0x84, (byte)0x92, (byte)0xd1, (byte)0xa3,
        		0x40, (byte)0x91, 0x42, 0x34, 0x26, 0x71, 0x11, 0x40,(byte) 0xfb};

        //System.out.println("H H"+ strBuffer.toString());
		/*for (int i=0;i<raw.length;i++) {
		    if (raw[i] <= 9)
		        new StringBuffer(hex).append('0');
		    hex.append(Integer.toHexString(raw[i]);
		}*/
		//System.out.println(r);
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		 
		String d1="2010/12/	27";
		Date d = new Date(d1);
		//System.out.println(d);
		String tod = df.format(d);
		System.out.println(tod);

		//String str = "26/08/1994";
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //please notice the capital M
		//Date date22 = formatter.parse(str);
		String text=null;
			/*if(text.equals("")) {
				text="0";
			}*/
		System.out.println("Outputting the text variable:" +text);
		String date = "23/04/2011";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		Date d6 = new Date(date);
		String dd= sdf.format(d6);
		System.out.println(dd+"-----");
		System.out.println(d6+"dddd");
		System.out.println(date.length());
		String day = date.substring(0, 2);
		System.out.println(day);
		String month = date.substring(3, 5);
		System.out.println(month);
		String year = date.substring(6, 10);
		System.out.println(year);
		
		int i =5;
		String s= "0"+i;
		System.out.println("s is : "+s);
		String date1="9-2-2011";
		System.out.println(date.length());;
		String day1 = date1.substring(0,1);
		String month1= date1.substring(2, 3);
		String year1 = date1.substring(4,8);
		System.out.println(day1+""+year1+""+month1);
		
		int da =9;
		int mon =7;
		int yer = 2011;
		
		if(da<9) {
			
			
		}
		String dateString = "002002002";
		System.out.println();
		Long id = Long.parseLong(dateString);
		long id1 =Long.valueOf(Long.parseLong(dateString));
		//System.out.println("printing the long value"+());
		
	}
}
