public class fourth_logic_operator {
    public static void main(String[] args) {
        boolean a =true;  
		boolean b = false;
		boolean c = true;
        boolean d = false;
        //true AND false = false
		System.out.println(a&&b); 
        //true AND true = true
		System.out.println(a&&c); 
		//true AND true = true
		System.out.println((2<4)&&(4<5));
        //true OR false = true
		System.out.println(a||b); 
        //true OR true = true
		System.out.println(a||c);
        //false OR false = false
		System.out.println(b||d);
    }
}
