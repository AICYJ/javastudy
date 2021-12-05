public class E_02_Constructor {
    public static void main(String[] args) {
        CellPhone my =new CellPhone();
		my.model="apple";
		System.out.println(my.model);
    }
}
class CellPhone{
	String model="Galaxy 8";
	String color="red";
	int capacity=60;
	CellPhone(){
		System.out.println("model: "+model);
		System.out.println("color: "+color);
		System.out.println("capacity: "+capacity);
	}
}