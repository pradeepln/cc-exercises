package exercise01;

public class DayOfWeekFinder {

	public static void main(String[] args) {
		DayOfWeekFinder f = new DayOfWeekFinder();
		String dow = f.findDayOfWeek(9, 3, 2021);
		
		System.out.println(dow);
	}

	public String findDayOfWeek(int day, int month, int year) {
		String dayOfWeek = "";
		
		int daysSince1900 = (year - 1900) * 365;
	
		daysSince1900 += (year - 1900) / 4; //the leap years
		
		daysSince1900 += calculateDaysElapsedInMonthsPrior(month);
		
		daysSince1900 += day;
		
		if (year % 4 == 0 && month <= 2) {
			daysSince1900--; //because the leap day hasn't yet passed
		}
		
		int dowIndex = daysSince1900 % 7;
		String[] possibleDaysOfWeek = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		dayOfWeek = possibleDaysOfWeek[dowIndex];
		return dayOfWeek;
	}

	int calculateDaysElapsedInMonthsPrior(int month) {
		int daysFromJanToLastMonth = 0;
		switch (month) { 
			case 12:
				daysFromJanToLastMonth += 30;
			case 11:
				daysFromJanToLastMonth += 31;
			case 10:
				daysFromJanToLastMonth += 30;
			case 9:
				daysFromJanToLastMonth += 31;
			case 8:
				daysFromJanToLastMonth += 31;
			case 7:
				daysFromJanToLastMonth += 30;
			case 6:
				daysFromJanToLastMonth += 31;
			case 5:
				daysFromJanToLastMonth += 30;
			case 4:
				daysFromJanToLastMonth += 31;
			case 3:
				daysFromJanToLastMonth += 28;
			case 2:
				daysFromJanToLastMonth += 31;
		}
		return daysFromJanToLastMonth;
	}

}
