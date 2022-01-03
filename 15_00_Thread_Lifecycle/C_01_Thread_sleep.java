public class C_01_Thread_sleep {
    public static void main(String[] args) {
		SleepThread t1 = new SleepThread();
		t1.start();
	}
}
class SleepThread extends Thread{
	public void run() {
		System.out.println("countdown 5 seconds");
		for (int i =5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.err.print(e.toString());
				}
			}
		}
		System.out.println("End");
	}
}