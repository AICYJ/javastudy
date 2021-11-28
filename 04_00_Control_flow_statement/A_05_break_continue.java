import java.util.Scanner;

public class A_05_break_continue {
    public static void main(String[] args) {
        System.out.println("To understand break, create a program that adds numbers until break condition 0 is entered.");
        Scanner sc =new Scanner(System.in);
		int sum=0,i=0;
		while(true) {
			System.out.println("Please enter a number to add. (End: 0)");
			i=sc.nextInt();
			if (i==0) {
				break;
			}
			sum=sum+i;
		}
		System.out.println("total sum ="+sum);

        System.out.println("To understand the continue, I will create a program that uses pocket money.");
        int money=10000;
		System.out.println("The current money is 10,000 won.");
		while(true) {
			System.out.println("How much do you want to use?");
			i =sc.nextInt();
			if(!(0<=i&&i<=money)) {
				System.out.println("Please input it again. (Out of range)");
				continue;
			}
			System.out.printf("We have %d won left. \n",money-=i);
			if(money<=0) {
				break;
			}
		}
		System.out.println("I used all the money. Termination");
    }
}
