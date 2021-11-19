import java.util.Scanner;
public class second_input_method {
    public static void main(String[] args) {
        //Scanner is input method package
        Scanner sc = new Scanner(System.in);
        // The following code is executed in two stages.
        // 1. input value
        // 2. output value
        // There are four ways to receive the input method.
        // 1. character
        // 2. Integer
        // 3. Float
        // 4. sentence
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.nextFloat());
        System.out.println(sc.next());
        System.out.println(sc.nextLine());
    }
    
}
