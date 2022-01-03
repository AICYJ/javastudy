public class D_01_Thread_yeild {
    public static void main(String[] args) {
		Thread6 s1 = new Thread6();
		Thread7 s2 = new Thread7();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t1.start();
		t2.start();
	}
}
class Thread6 implements Runnable{

	@Override
	public void run() {
		for (int i=0;i<20;i++) {
			System.out.print("@");
			Thread.yield();// Even if Thread6 is executed first, 
						   // it is set to yield when other threads try to work.
		}
	}
}
class Thread7 implements Runnable{
	@Override
	public void run() {
		for (int i=0;i<20;i++) {
			System.out.print("#");
		}
	}
	
}