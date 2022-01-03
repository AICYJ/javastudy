public class A_01_Thread {
    public static void main(String[] args) {
		//thread request to JVM
		//1)Requests a thread of a class that inherits from the thread class.
		MyThread th1 =new MyThread();
		th1.start();
		//2) Request a thread of a class that implements the Runaable interface
		Mythread2 th2 =new Mythread2();
		Thread t = new Thread(th2);
		t.start();
		for (int i =0;i<10;i++) {
			System.out.println("main function in progress"+i);
		}
	}
}
//1) Inherit thread class to implement tasks
class MyThread extends Thread{
	//run( ) method overriding 
	public void run() {
		// Implementation of work to be done by the thread
		for (int i =0;i<10;i++) {
			System.out.println("thread in progress"+i);
		}
	}
}
//2)implement the runnable interface
class Mythread2 implements Runnable{
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("runnerable progress"+i);
		}
	}
	
}