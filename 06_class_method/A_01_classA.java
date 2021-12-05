public class A_01_classA {
    public static void main(String[] args) {
        // We instantiated ClassA into ca to create an instance.
        ClassA ca = new ClassA();
        // ca instance variavle
        ca.x= 20;
        // ca instance method
        ca.f1();
    }
}
class ClassA{
    // this code define class(blueprint)
    int x;
    void f1(){
        System.out.println("f1() in ClassA");
    }
}
