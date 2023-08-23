package Stream;

public class PraticeLeapYear {
	public static void main (String[]args) {
		int year = 2019;
		boolean isLeapYear = false;
		for(int i=4;i<=year;i+=4) {
			if(year==i) {
				isLeapYear = true;
				break;
			}
		}
		if(isLeapYear) {
			System.out.println("Year is LeapYear");
		}else {
			System.out.println("Year is Not LeapYear");
		}
	}

}
