public class third_change_data_type {
    public static void main(String[] args) {
        int a=65;
		System.out.println(a);
        // automatically data type is changed in the code below
		float f=a;
		System.out.println(f);
        // automatically data type isn't changed in the code below
//		char c = a;
//		System.out.println(c);
		// In order to forcibly convert the form, you must use () to place it in front of the variable as shown in the code below.
		char c = (char) a;
		System.out.println(c);
    }
}
