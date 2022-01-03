public class F_02_Thread_sync_solve {
    public static void main(String[] args) {
		MyThreadB s1 = new MyThreadB();
		Thread t1 = new Thread(s1,"A");
		Thread t2 = new Thread(s1,"B");
		Thread t3 = new Thread(s1,"C");
		t1.start();
		t2.start();
		t3.start();
	}
}
class MyThreadB implements Runnable{
	Ticketing ticket =new Ticketing();
	@Override
	public void run() {
		ticket.ticketing();
	}
}
class Ticketing{
	int ticketNumber=1;
	public void ticketing() {
        synchronized(this) {
		if (ticketNumber>0) {
			System.out.println(Thread.currentThread().getName()+"Ticketing success");
			ticketNumber--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"Ticketing fail...");
		}
		System.out.println(Thread.currentThread().getName()+"Number of tickets after a ticketing attempt: "+ticketNumber);
	}}
}