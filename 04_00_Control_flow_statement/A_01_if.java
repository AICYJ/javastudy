import java.util.Scanner;

public class A_01_if {
    public static void main(String[] args) {
        //if
        if(true) {
			System.out.println("always true.");
		}
        //if-else if- else(bus fare by age)
        int age =15;
		if (age>19) {
			System.out.println("adult!");
			System.out.println("Adult fees apply.");
		}else if(age>13)  {//13<age<=19
			System.out.println("Youth!");
			System.out.println("Youth rates apply.");
		}else if (age>8) {//8<age<=13
			System.out.println("Children!!.");
			System.out.println("Children's fees apply.");
		}else {//age<=8
			System.out.println("Infant!!.");
			System.out.println("Infant fees apply.");
		}
		System.out.println("Please pay for the bus fare.");
        //Overlapping if
        String id,password;
		Scanner input =new Scanner(System.in);
		System.out.print("Please enter your id:");
		id= input.nextLine();
		if(id.equals("java")) {
			System.out.println("id matches!");
			System.out.println("Please enter your password:");
			password=input.nextLine();
			if(password.equals("abc123")) {
				System.out.println("password matches");
				System.out.println("login success!");
			}else {
				System.out.println("password not matches");
			}
		}else {
			System.out.println("id matches");
		}
    }
    
}
