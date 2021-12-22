import java.util.Scanner;

public class A_04_while_vendingmachine {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("please insert money($): coffee is 2 dollar");
        int money= sc.nextInt();
        int count=0;
        while(money>=2){
            count++;
            System.out.println("buy "+count+" coffee");
            money-=2;
            
        }
    }
    
}
