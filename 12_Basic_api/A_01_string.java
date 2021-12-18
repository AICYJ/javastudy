public class A_01_string {
    public static void main(String[] args) {
		String str="MrChooCAI";
		//concat
		System.out.println(str.concat(" world!"));
		System.out.println(str);
		//substring(start index, end index)
		System.out.println(str.substring(1,4));
		//only start index
		System.out.println(str.substring(3));
		//length
		System.out.println(str.length());
		//toUppercase, toLowercase
		System.out.println(str.toUpperCase());
		System.out.println("tesT".toLowerCase());
		
		//charAt(index), indexOf(char),equals(string)
		System.out.println(str.charAt(0));
		//If not found, return -1.
		System.out.println(str.indexOf('o'));
		System.out.println(str.equals("hello"));
		//It is case-sensitive.
		System.out.println(str.equals("HELLO"));
        
		System.out.println("test".trim());
		System.out.println("hellow world".replace('l','L'));
		System.out.println("hellow world".replace("hello", "bye"));
		
	}
}
