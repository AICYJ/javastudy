class A{}

class B extends A{}

public class sixth_etc_operator {
    public static void main(String[] args) {
        //ternary operator
        int age =17;
		System.out.println(age>19?"adult.":"junior");
        //junior
		int age2=20;
		System.out.println(age2>19?"adult.":"junior");
        //adult

        //Addtion Assignment Operator
        int x =  10;
		x=x+10;
		System.out.println(x);
		
		int y=10;
		y+=10;//y=y+10
		System.out.println(y);
        //It can be seen that the above code shows the same result.

        //instanceof operator
        String s= "Hello";
		int i=3;
		float f = 3.14f;
		double d=3.14;
		char c = 'a';
        //true
		System.out.println(s instanceof String);
		//true
        System.out.println(Integer.valueOf(i) instanceof Integer);
		//true
        System.out.println(Float.valueOf(f) instanceof Float);
		//true
        System.out.println(Double.valueOf(d) instanceof Double);
		//true
        System.out.println(Character.valueOf(c) instanceof Character);
		
		A a = new A();
		B b= new B();
		//true
		System.out.println("a instance of A: "+(a instanceof A));
		//true
        System.out.println("b instance of A: "+(b instanceof A));
		//false
        System.out.println("a instance of B: "+(a instanceof B));
		//true
        System.out.println("b instance of B: "+(b instanceof B));
        
    }
}
