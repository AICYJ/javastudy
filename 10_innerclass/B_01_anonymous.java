public class B_01_anonymous {
    public static void main(String[] args) {
		//It declares that it will be newly defined in wave brackets..
		OuterClass1 o = new OuterClass1() {
			 void a() {
				 System.out.println("The newly defined anonymous class method.");
			 }
		};
		o.a();
		OuterClass1 ok =new OuterClass1();
		ok.a();
		
	}
}
class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}

