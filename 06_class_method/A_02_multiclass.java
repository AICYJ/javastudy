public class A_02_multiclass {
    public static void main(String[] args) {
        ClassAA ca1 = new ClassAA();
        ClassAA ca2 = new ClassAA();
        ClassAA ca3 = new ClassAA();
        ca1.x=10;
        ca2.x=20;
        ca3.x=30;
        System.out.println("ca1.x:"+ca1.x+"ca2.x:"+ca2.x+"ca3.x"+ca3.x);
		ca1.f1();
		ca2.f2();
		ca3.f1();
		System.out.println("ca1.x:"+ca1.x+"ca2.x:"+ca2.x+"ca3.x"+ca3.x);
    }
}
class ClassAA{
    // this code define class(blueprint)
    int x;
    void f1(){
        x=+1;
        System.out.println("The f1 method increased x by 1.");
    }
    void f2(){
        x=-1;
        System.out.println("The f1 method decreased x by 1.");
    }
}