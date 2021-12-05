public class E_03_Constructor {
    public static void main(String[] args) {
        Bclass b = new Bclass("apple");
		System.out.println(b.name);
    }
}
class Bclass{
	String name;
	Bclass(String name){
		System.out.println("Bclass parameter constructor");
		this.name=name;
	}
}