/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Counting number of Sundays that fell on 1st f month in 20th century
 * 
 */

public class Problem019 {

	static int day = 1;
	static int total = 0;
	
	public static int nextDay(int day) {
		day++;
		if(day == 8)
			return 1;
		return day;
	}
	
	public static void checkSunday(int year, int month) {
		int days;
		if(month == 1)
			days = 31;
		else if(month == 2) {
			if((year % 4) == 0 && year != 1900)
				days = 29;
			else
				days = 28;
		}
		else if(month == 3)
			days = 31;
		else if(month == 4)
			days = 30;
		else if(month == 5)
			days = 31;
		else if(month == 6)
			days = 30;
		else if(month == 7)
			days = 31;
		else if(month == 8)
			days = 31;
		else if(month == 9)
			days = 30;
		else if(month == 10)
			days = 31;
		else if(month == 11)
			days = 30;
		else
			days = 31;
		
		for(int i = 1; i <= days; i++) {
			if(i == 1 && day == 7) {
				System.out.println(i + "/" + month + "/" + year);
				total++;
			}
			day = nextDay(day);
		}
	}
	
	public static void main(String[] args) {
		
		for(int i = 1900; i < 2001; i++) {
			for(int month = 1; month < 13; month++)
				checkSunday(i, month);
		}
		
		//includes year 1900
		int all = total;
		
		day = 1;
		total = 0;
		//find for just year 1900
		for(int i = 1900; i < 1901; i++) {
			for(int month = 1; month < 13; month++)
				checkSunday(i, month);
		}
		
		System.out.println(all - total);
	}

}
