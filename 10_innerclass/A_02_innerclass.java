public class A_02_innerclass {
    public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("outter class a :"+oc.a);
		System.out.println("outter class b :"+OuterClass.b);
//		How to create an object in an internal class
//		outterclass.innerclass instancename = new outterclass().innerclass()
		System.out.println("=====inner class====");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		System.out.println("Inner c:"+i.c);
		i.InnerMethod();
//		Calling static inner class.
		OuterClass.Staticinner si =new OuterClass.Staticinner();
		System.out.println("StaticInner d:"+si.d);
//		si.staticMethod(); You can call the inner static class using the class name without using the instance.
		OuterClass.Staticinner.staticMethod();
	}

}
class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void InnerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class Staticinner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}