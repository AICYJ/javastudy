public class B_01_Thread_priority {
    public static void main(String[] args) {
		Runnable t = new MyThread3();
		Thread t1= new Thread(t,"thread1");
		t1.setPriority(1);
		System.out.println("The priority of t1 is:"+t1.getPriority());
		
		Thread t2= new Thread(t,"thread2");
		//If you don't specify a priority, it automatically has 5.
		System.out.println("The priority of t2 is:"+t2.getPriority());
		Thread t3= new Thread(t,"thread3");
		t3.setPriority(10);
		System.out.println("The priority of t3 is:"+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class MyThread3 implements Runnable{
	public void run() {
		for(int i =0;i<5;i++) {
			System.out.println("<"+Thread.currentThread().getName()+">");
		}
		for(int i=0;i<10000;i++) {}
	}
	
}