public class B_01_instance_class_variable {
    public static void main(String[] args) {
        Car myCar1=new Car();
		Car myCar2=new Car();
		System.out.println("<before change>");
		System.out.println("myCar1.speed: "+myCar1.speed);
		System.out.println("myCar2.speed: "+myCar2.speed);
		System.out.println("myCar1.wheel: "+myCar1.wheel);
		System.out.println("myCar2.wheel: "+myCar2.wheel);
		myCar2.speed=100;
		myCar2.wheel=5;
		System.out.println("<after change>");
		System.out.println("myCar1.speed: "+myCar1.speed);
		System.out.println("myCar2.speed: "+myCar2.speed);
		System.out.println("myCar1.wheel: "+myCar1.wheel);
		System.out.println("myCar2.wheel: "+myCar2.wheel);
	}
}
class Car{
    //static is important
	static int wheel=4;//class variable with "static"
	int speed;//instance variable
}