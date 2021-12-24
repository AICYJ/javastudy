public class E_03_javatime_with {
    public static void main(String[] args) {
		LocalDate ld= LocalDate.now();
		System.out.println("now date: "+ld);
		
		LocalDate new_ld=ld.withYear(1988).withMonth(7).withDayOfMonth(20);
		System.out.println("MrChoo birthday: "+new_ld);
	}
}
