public class A_02_override {
    public static void main(String[] args) {
		System.out.println("Class Leader say");
		Leader l = new Leader();
		l.say();
		System.out.println("Students say");
		Student2 s = new Student2();
		s.say();
	}
}
class Student2{
	void learn() {
		System.out.println("learn");
	}
	void eat() {
		System.out.println("eat");
	}
	void say() {
		System.out.println("good morning teacher");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() {
		System.out.println("Say hi to the teacher.!");
	}
}