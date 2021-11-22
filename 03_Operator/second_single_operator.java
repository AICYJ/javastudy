public class second_single_operator {
    public static void main(String[] args) {
        //sign operator
        int a=-1;
		int b=2;
		System.out.println(a);
		System.out.println(+a);
		System.out.println(-a);
		System.out.println(+b);
		System.out.println(-b);
        
        //Logic denial operator.
        boolean c=true; 
		boolean d=false;
		boolean e=!d; 
		System.out.println(c);
		System.out.println(!c);
		System.out.println(d);
		System.out.println(e);
        
        //Increase/decrease operator.
        int f=1;
		System.out.println(f);
		f++;
		//result is 2.
		System.out.println(f);
		//prefix operator
        //In potential operators, operations are first performed and output.
		System.out.println(++f);
		//postfix operator
        //In the rear type operator, the output is first and the operation is performed.
		System.out.println(f++);
        //Through the code above, we learned the difference between the posterior and potential operations.
		System.out.println(f);
    }
}
