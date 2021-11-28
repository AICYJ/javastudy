import java.util.Scanner;

public class A_02_switch {
    public static void main(String[] args) {
        //hotel priemium expain
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter your hotel premium level. (1: diamond, 2: gold, 3: silver, 4: general member)");
        int level=sc.nextInt();
		switch(level) {
		case 1://diamond
			System.out.println("50% discount on suite rooms.");
//			break;
		case 2: //gold
			System.out.println("Free swimming pool.");
//			break;
		case 3: //silver
			System.out.println("Dinner buffet is free.");
//			break;
		default: //general member
			System.out.println("A cup of hotel coffee for free.");
		}
    }
    
}
