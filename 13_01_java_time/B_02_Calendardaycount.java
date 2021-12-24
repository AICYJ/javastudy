public class B_02_Calendardaycount {
    public static void main(String[] args) {
		Calendar a = Calendar.getInstance();
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		int date= a.get(Calendar.DATE);
		System.out.println(year+"year"+month+"month"+date+"day");
		System.out.print("What day is today in this week:");
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		
		System.out.print("What day is today in this year:");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.print("How many days is this month: ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}
}
