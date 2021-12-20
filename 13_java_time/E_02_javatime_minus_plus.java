public class E_02_javatime_minus_plus {
    public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println("now date: "+ld);
		LocalDate ld2=ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println("minus 2years, plus 3month, minus 4day: "+ld2);
		
		LocalDate ld3=ld2.minusDays(22);
		System.out.println("-22day: "+ld3);
		
		LocalDate ld4=ld3.plusWeeks(3);
		System.out.println("+3week: "+ld4);
	}
}
