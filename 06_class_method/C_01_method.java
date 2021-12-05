public class C_01_method {
    public static void main(String[] args) {
        hello();
		System.out.println("rectangle area: "+caculator(3,7));
	}
	static int caculator(int a, int b) {
		System.out.println("<start calculation.>");
		int area=a*b;
		return area;
	}
	static void hello() {
		System.out.println("hello~ this is calculator.");
	}
}