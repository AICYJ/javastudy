public class B_02_autoboxing {
    public static void main(String[] args) {
		Integer i =100; //auto boxing
		//Integer --> int
		System.out.println(i.intValue());
		//Integer --> double
		System.out.println(i.doubleValue());
		//Integer --> float
		System.out.println(i.floatValue());
		//Integer --> String
		System.out.println(i.toString()+3);
		System.out.println("hellow0"+"world");
	}
}
