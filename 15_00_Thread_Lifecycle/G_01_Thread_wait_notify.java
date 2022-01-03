public class G_01_Thread_wait_notify {
    public static void main(String[] args) {
		Account account= new Account();
		Son son = new Son(account);
		Mom mom = new Mom(account);
		son.start();
		mom.start();
	}
}
class Son extends Thread{
	private Account account;
	Son(Account account){
		this.account=account;
	}
	public void run() {
		for (int i=0;i<5;i++) {
			account.getMoney();
		}
	}
}
class Mom extends Thread{
	private Account account;
	Mom(Account account){
		this.account=account;
	}
	public void run() {
		for (int i=0;i<5;i++) {
			account.setMoney();
		}
	}
}
class Account{
	int money=0;
	//Deposit, withdraw
	public int showMoney(){
		return money;}
	public synchronized void setMoney() {
		try {
			Thread.sleep(100);
			
		}catch(InterruptedException ie)
		{System.out.println(ie.toString());}
		this.money +=2000;
		System.out.println("My mother deposited pocket money. Current Balance:"+this.showMoney());
		this.notify();

	}
	public synchronized void getMoney() {
		while(money<=0) {
			try {
				System.out.println("Waiting for my son because there is no account balance");
				this.wait();
			}catch(InterruptedException i) {}
		}
		this.money-=2000;
		System.out.println("My son withdrew pocket money. Current Balance:"+this.showMoney());
	}
}