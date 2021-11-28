import java.util.Random;
import java.util.Scanner;

public class A_04_while {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
		Random random=new Random();
		int num= random.nextInt(100)+1;
		int user=-1;
		while(user!=num) {
            System.out.print("It's up down game. Let's guess the numbers.");
			System.out.print("Please enter a number:");
			user=sc.nextInt();
			//unser ==nu,
			if(user==num) {
				System.out.println("Congratulations. That's correct.");
			}
			//user>num down
			else if(user>num) {
				System.out.println("Down");
			}
			//user<num up
			else {
				System.out.println("Up");
			}
		}
    }
}
