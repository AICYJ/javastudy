public class A_01_interface {
    public static void main(String[] args) {
		Ainter a;
		//Since the variable is defined as final, it is impossible to change the value.
//		a.x=40;
		B b=new B();
		b.methodA();
		b.methodB();
	}
}
class B implements Ainter{
	@Override
	public void methodA() {
		System.out.println("methodA()");
	}
	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
}
interface Ainter{
	final int x=10;
	int y=20; //Keyword final can be omitted.
	abstract void methodA();
	//Keyword abstract can be omitted.
	void methodB();
}