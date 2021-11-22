public class fifth_bit_operator {
    public static void main(String[] args) {
        int a=15;//1111(2)
		int b=5;//0101(2)

		//bit logic operator
        //1111 and 0101 =0101 : 5	
		System.out.println(a&b);
        //1111 or 0101 =1111 : 15	 
		System.out.println(a|b); 
        //1111 xor 0101 =1010 : 10	
		System.out.println(a^b); 
        // not 0101 = -0101 - 0001 =-0110 :-6
		System.out.println(~b); 
		// 1111 >> 0111 >> 0011 : 3
		System.out.println(a>>2);
		// 0101 >>1010 >> 10100 : 40
		System.out.println(b<<3);
    }
}
