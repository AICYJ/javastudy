public class A_03_for {
    public static void main(String[] args) {
        System.out.println("turn on computer 1");
        System.out.println("turn on computer 2");
        System.out.println("turn on computer 3");
        System.out.println("turn on computer 4");
        System.out.println("turn on computer 5");
        System.out.println("turn on computer 6");
        System.out.println("turn on computer 7");
        System.out.println("turn on computer 8");
        System.out.println("turn on computer 9");
        System.out.println("turn on computer 10");
        //general for
        for (int i=1;i<=10;i++){
            System.out.println("turn on computer "+i);
        }
        //decrease for
        for (int i=10;i>=1;i--){
            System.out.println("turn on computer "+i);
        }
        //for with if
        for (int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("turn on computer "+i);
            }
        }
        //increase 2 by step for
        for (int i=1;i<=10;i+=2){
            System.out.println("turn on computer "+i);
        }

    }
}
