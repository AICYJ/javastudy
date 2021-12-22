import java.util.Random;
import java.util.Scanner;

public class A_04_while_updowngame {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Up-down game is a game in which players guess numbers.\nWhen the player says an arbitrary number, it tells you up or down as a hint. \nYou can guess the answer based on the hint.");
		Random random=new Random();
		int num= random.nextInt(100)+1;
		int user=-1;
		while(user!=num) {
			System.out.print("input number:");
			user=sc.nextInt();
			//unser ==nu,
			if(user==num) {
				System.out.println("great~ it is target number.");
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
