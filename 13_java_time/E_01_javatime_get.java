public class E_01_javatime_get {
    public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		System.out.println(ld.getYear()+"year "+ld.getMonthValue()+"month "+ld.getDayOfMonth()+"day");
		System.out.println(lt.getHour()+"hour "+lt.getMinute()+"min "+lt.getSecond()+"sec" );
	}
}
