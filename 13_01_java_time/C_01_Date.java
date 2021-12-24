public class C_01_Date {
    public static void main(String[] args) {
		Date today=new Date();
		System.out.println("Date(): "+today);
		
		long a= System.currentTimeMillis();
		System.out.println("currentTimeMills: "+a);
		Date today2=new Date(a);
		System.out.println("Date(currentTimeMills): "+today2);
	}
}
