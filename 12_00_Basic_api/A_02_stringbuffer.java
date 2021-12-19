public class A_02_stringbuffer {
    public static void main(String[] args) {
		String str ="test";
		StringBuffer buffer =new StringBuffer("test");
		System.out.println("str:"+str);
		System.out.println("buffer:"+buffer);
		
		buffer.append(" Test");
		System.out.println("buffer.append:"+buffer);
		str.concat(" Test");
		System.out.println("str.concat: "+str);
		
		str.replace('t', 'T');
		System.out.println(str);
		buffer.replace(1, 3, "ES");
		System.out.println(buffer);
	}
}
