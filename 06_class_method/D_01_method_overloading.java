public class D_01_method_overloading {
    public static void main(String[] args) {
        sum(10,20);
		sum(1.23,3.14);
		sum(10,20,30);
	}
	//Changes in parameter types.
	static void sum(int x, int y) {
		System.out.println(x+y);
	}
	//Changes in parameter types.
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	//Changes in the number of parameters.
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}

}