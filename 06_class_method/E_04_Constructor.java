public class E_04_Constructor {
    public static void main(String[] args) {
        Iphone my1=new Iphone();
		Iphone my2=new Iphone("iphone SE","black",256);
		System.out.println("my1 use basic constructor");
		my1.info();
		System.out.println("my2 use parameter constructor");
		my2.info();
    }
}
class Iphone{
	String model;
	String color;
	int capacity;
//	generate basic constructor
	Iphone(){}
//	generate parameter constructor
	Iphone(String model, String color,int capacity){
		this.model= model;
		this.color=color;
		this.capacity =capacity;
	}
	void info() {
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("capacity:"+capacity);
	}
}