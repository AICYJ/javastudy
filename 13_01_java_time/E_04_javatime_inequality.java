public class E_04_javatime_inequality {
    public static void main(String[] args) {
		LocalDateTime ldt1=LocalDateTime.of(2002, 1,1,12,30,45,222);
		System.out.println("ldt1: "+ldt1);
		LocalDateTime ldt2=LocalDateTime.of(2002, 12,31,23,37,55,777);
		System.out.println("ldt2: "+ldt2);
		System.out.println("ldt1.isAfter(ldt2):"+ldt1.isAfter(ldt2));
		System.out.println("ldt1.isBefore(ldt2):"+ldt1.isBefore(ldt2));
		System.out.println("ldt2.equals(ldt1):"+ldt2.equals(ldt1));
	}
}
