public class A_01_override {
    public static void main(String[] args) {
		Student st =new Student();
		System.out.println("-------------student------------");
		st.breath();//parent class method
		st.learn();//child class method
		System.out.println("------------teacher-----------");
		Teacher t = new Teacher();
		t.eat();//parent class method
		t.teach();//child class method
	}
}
class Person{
	void breath() {
		System.out.println("breath");
	}
	void eat() {
		System.out.println("eating");
	}
	void say() {
		System.out.println("say");
	}
}
// class Student extends Person,extends Teacher{
class Student extends Person{
	void learn() {
		System.out.println("learn");
	}
}
class Teacher extends Person{
	void teach() {
		System.out.println("teaching");
	}
}