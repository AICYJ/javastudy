public class A_2_exception {
    public static void main(String[] args) {
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("Exceptions on the main method.");
		}
	}//Through throws, you can transfer responsibility for exceptions.
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;
	}
}