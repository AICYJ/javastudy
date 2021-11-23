import java.util.Random;
import java.util.Scanner;

public class Random_Evolution_Pokemon {
    public static void main(String[] args) {
//		1. 변수 정의
		String mypokemon;
		int evolution;
//		2. 메서드 정의
		Scanner sc = new Scanner(System.in);
		Random rm = new Random();
//		3. 구성도 상상 및 구현
		System.out.println("☆★☆★Pokemon Random Evolution Program! WoW ~☆★☆★");
		System.out.println("Pokemon evolves with 25%!");
		System.out.println("Please choose the monster. (1: Pikachu 2: Squirtle 3: Charmander)");
		mypokemon=sc.next();
		evolution=rm.nextInt(4);
        System.out.println(evolution);
		if (mypokemon.length()>1) {
			System.out.println("You entered more than two digits. Please type in 1, 2, 3.");
		}else if(mypokemon.equals("1")) {
			System.out.println("Pikachu!!! Pika~");
			if (evolution==1) {
				System.out.println("Congratulations!! You succeeded in evolving Raichu.");
				System.out.println("Rai Rai Raichu!");
				
				System.out.println("Raichu 10 million bolt Thunder.~~~!!!@#!@#");
			}else {
				System.out.println("Pika Pika Pikachu!!");
				System.out.println("A million volts!@#!@#!@#");
				
			}
		}else if(mypokemon.equals("2")) {
			System.out.println("Squirtle!!! Squir~");
			if (evolution==1) {
				System.out.println("Congratulations. You succeeded in evolving Wartortle@#$@#$!!");
				System.out.println("Wartor Wartor Wartortle!");
				
				System.out.println("Wartortle a spray of water spray.!!!~~~!!!@#!@#");
			}else {
				System.out.println("Squir Squir!!");
				System.out.println("Water shot~~!@#!@#!@#");
				
			}
		}else if(mypokemon.equals("3")) {
			System.out.println("Charman Charman Charmander~");
			if (evolution==1) {
				System.out.println("Congratulations. You succeeded in evolving Charmeleon !$@#$@#%");
				System.out.println("leon leon Charmeleon!");
				
				System.out.println("Charmeleon  Hellfire!@#!@#~~~!!!@#!@#");
			}else {
				System.out.println("Charman Charman !!");
				System.out.println("fire ball~@$~!@#!@#!@#");
				
			}
		} 
    }
}
