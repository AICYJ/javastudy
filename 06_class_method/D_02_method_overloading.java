public class D_02_method_overloading {
    public static void main(String[] args) {
		//Calculate the four rules of integers.
		System.out.println("sum(10,20);"+sum(10,20)); 
		System.out.println("mul(10,20);"+mul(10,20)); 
		System.out.println("sub(10,20);"+sub(10,20)); 
		System.out.println("div(10,20);"+div(10,20)); 
		//Calculate the rules of floats.
		System.out.println("sum(1.0,2.0);"+sum(1.0,2.0)); 
		System.out.println("mul(1.0,2.0);"+mul(1.0,2.0)); 
		System.out.println("sub(1.0,2.0);"+sub(1.0,2.0)); 
		System.out.println("div(1.2,2.3);"+div(1.2,2.3)); 
        // Adding strings.
		System.out.println("sum(hellow,world):"+sum("hellow","world"));
	}
	static int sum(int x, int y) {return x+y;}
	static int mul(int x, int y) {return x*y;}
	static int sub(int x, int y) {return x-y;}
	static int div(int x, int y) {return x/y;}
	static double sum(double x, double y) {return x+y;}
	static double mul(double x, double y) {return x*y;}
	static double sub(double x, double y) {return x-y;}
	static double div(double x, double y) {return x/y;}
	static String sum(String x, String y) {return x+y;}
}