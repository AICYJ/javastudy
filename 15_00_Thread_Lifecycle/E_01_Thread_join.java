public class E_01_Thread_join {
    public static void main(String[] args) {
		MyThread8 s1= new MyThread8();
		MyThread9 s2= new MyThread9();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		try {
//			In order to execute t1 first, block everything else!
			t1.join();
		}catch(InterruptedException e) {System.out.println(e.toString());}
		t2.start();
		try {
//			In order to execute t2 first, block everything else
			t2.join();
		}catch(InterruptedException e) {System.out.println(e.toString());
		}
		for(int i=0;i<7;i++) {
			System.out.println("main Thread:"+i);
		}
	}
}
class MyThread8 implements Runnable{
	@Override
	public void run() {
		for(int i =0 ; i<7;i++) {
			System.out.println("t1: "+i);
		}
		System.out.println("<<t1_finish>>");
	}
}
class MyThread9 implements Runnable{
	@Override
	public void run() {
		for(int i =0 ; i<7;i++) {
			System.out.println("t2: "+i);
		}
		System.out.println("<<t2_finish>>");
	}
}