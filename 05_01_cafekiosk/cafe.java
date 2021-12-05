import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class cafe {

	public static void main(String[] args) {
		//cafe program~@@@
        // main fuction and story
		//order
			//menu~ , menu and price~ ,totalprice ,  orderlist
		//cancel
			//substraction menu from menu list and price from total price
		//payment 
			//total price
			//if rack of money...
			//if we recive more money....
			//finish program
		//gone.... finish
			//i dont like all menus....
		
		int  totalprice, i,count;
		String OrderList[]= new String[5];
		int Orderpice[] = {0,0,0,0,0};
		Scanner sc= new Scanner(System.in);
		count=0;
		totalprice=0;
		System.out.println("wellcome. this is cafe program!.");
		while(true) {
			System.out.println("order: 1, cancel: 2, payment: 3, quit: 4");
			i=sc.nextInt();
			if(i==1) {
				System.out.println("1.americano 3 dollar");
				System.out.println("2.milk tea 4 dollar");
				System.out.println("3.season menu 5 dollar");
				int j=sc.nextInt();
				if(j==1) {
					OrderList[count]="americano";
					Orderpice[count]=3;
					totalprice+=3;
					count+=1;}
				else if(j==2) {
					OrderList[count]="milk tea";
					Orderpice[count]=4;
					totalprice+=4;
					count+=1;}
				else if(j==3) {
					OrderList[count]="season menu";
					totalprice+=5;
					Orderpice[count]=5;
					count+=1;}
				else{
					System.out.println("you press wrong number..please press number from 1 to 3");}
				//order
				System.out.println("order list below");
				for(int k=0;k<count;k++) {
					System.out.println(k+1+" order:"+OrderList[k]+" price:"+Orderpice[k]);
				}
			}
			else if(i==2) {
//				cancel
				for(int k=0;k<count;k++) {
					System.out.println(k+1+" order:"+OrderList[k]+" price::"+Orderpice[k]);
				}
				int c= sc.nextInt();
				totalprice-=Orderpice[c-1];
				for(int p=c;p<count+2;p++) {
					if (p==5) {
						OrderList[p-1]="";
						Orderpice[p-1]=0;
						}
						
					else{
						OrderList[p-1]=OrderList[p];
						Orderpice[p-1]=Orderpice[p];
						}
					}
				count--;
				System.out.println("complete cancelation");
				for(int k=0;k<count;k++) {
					System.out.println(k+"order:"+OrderList[k]+" price:"+Orderpice[k]);
				}
				}
			else if(i==3) {
//				payment
				System.out.println("total price:"+totalprice);
				int p = sc.nextInt();
				if(p<totalprice) {
					System.out.println("rack of money."+totalprice+"is total price.");}
				else{
					System.out.println("finish payment."+(p-totalprice)+"is remain money.");
					break;}
			}
			else if(i==4) {
//				finish
				break;}
			else{
//				show error
				System.out.println("please input from 1 to 4!!");}
		}
	}

}