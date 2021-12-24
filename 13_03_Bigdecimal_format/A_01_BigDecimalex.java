public class A_01_BigDecimalex {
    public static void main(String[] args) {
		double a= 23.6776;
		double b= 62.5469998;
		System.out.println("double: "+a+b);
		
		BigDecimal num1= new BigDecimal(String.valueOf(a));
		BigDecimal num2= new BigDecimal(String.valueOf(b));
		System.out.println("BigDecimal: "+num1.add(num2));
	}
}
