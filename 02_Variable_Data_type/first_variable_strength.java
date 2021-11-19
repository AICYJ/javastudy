public class first_variable_strength {
    public static void main(String[] args) {
        // 1. Easy modification(first reason)
        System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
        // when we need to change from 100 to 10, repeat 10 times for change print value.
        // The code below only needs to modify the variable x.
        int x=100;
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
		System.out.println(x);
        
        // 2. Additional operations are possible by reusing variables.
        System.out.println(2+3);
		System.out.println(2+3+5);
        // this is nomal case
        // when we use variavle can be changed from uppper code to below code
        int y =2+3;
		System.out.println(y);
		System.out.println(y+5);
        
        // 3. Variables can be given meaning.
        // in the code below, we cant know meaning of newyork
        System.out.println("Newyork");
		System.out.println("seoul");
        // The code below tells you that the area you live in now is New York.
        String now ="Newyork";
		String hometown="seoul";
		System.out.println(now);
		System.out.println(hometown);

    }
}
