public class A_1_exception {
    public static void main(String[] args) {
		try {
			Exception e= new Exception("intentional exception");
			throw e;//I'll make an exception intentionally..
		}
		catch(Exception e) {
			System.out.println("Exception occurred");
			System.out.println(e.getMessage());
		}
	}
}
