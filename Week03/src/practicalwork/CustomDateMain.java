package practicalwork;

public class CustomDateMain {
	public static void main(String[] args) {
		CustomDate date = new CustomDate(29, 2, 2020);
		System.out.println("Date: " + date);

		date.setDay(28);
		System.out.println("Date: " + date);

		date.setMonth(4);
		System.out.println("Date: " + date);

		date.setYear(2021);
		System.out.println("Date: " + date);
		
		
		CustomDate date1 = new CustomDate(15, 5, 2022);
		CustomDate date2 = new CustomDate(16, 5, 2022);
		System.out.println("Date1: " + date1);
		System.out.println("Date2: " + date2);
		

		int result = CustomDate.compare(date1, date2);

		if (result < 0) {
			System.out.println("1, date 1 is earlier than date 2");
			
		} else if (result == 0) {
			
			System.out.println("0, date 1 is equal to date 2");
			
		} else {
			
			System.out.println("-1, date 2 is earlier than date 1");
			
		}
	}
}
