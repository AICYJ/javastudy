public class TimerTaskex {
    public static void main(String[] args) throws InterruptedException{
		Timer t= new Timer(true);
		TimerTask w1=new Work1();
		TimerTask w2=new Work2();
		
		t.schedule(w1,4000);
		t.schedule(w2, 1000);
		Thread.sleep(4000);
		System.out.println("all work is terminated!");
		
	}
}
class Work1 extends TimerTask{
	@Override
	public void run() {
		System.out.println("work1 run");
	}
}
class Work2 extends TimerTask{
	@Override
	public void run() {
		System.out.println("work2 run");
	}
}
