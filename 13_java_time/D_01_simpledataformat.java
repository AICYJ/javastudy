public class D_01_simpledataformat {
    public static void main(String[] args) {
		Date day =new Date();
		String patternKorea="yyyy-MM-dd";
		String patternUSA="MM-dd-yyyy";
		String patternUK="dd-MM-yyyy";
		
		SimpleDateFormat p1= new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2= new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3= new SimpleDateFormat(patternUK);
		System.out.println("nowday:"+day);
		System.out.println("korea format(year, month, day): "+p1.format(day));
		System.out.println("USA format(year, month, day): "+p2.format(day));
		System.out.println("UK format(year, month, day): "+p3.format(day));
	}
}
