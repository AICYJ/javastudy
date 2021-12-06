public class C_01_polymorphism {
    public static void main(String[] args) {
		System.out.println("reference variable without upcasting ");
		Student st1 = new Student("apple",29,3);
		st1.info();
		st1.hobby();
		st1.school();
		System.out.println("reference variable with upcasting");
		Human h1 =new Student("banana",30,2);
		h1.info();
		h1.hobby();
//		h1.school();
//		h1.grade;
		System.out.println("reference variable with downcasting");
		Student h2 = (Student) h1;
		h2.hobby();
		h2.school();
		System.out.println("h2's grade:"+h2.grade);
		
	}
}
class Human{
	String name;
	int age;
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void info() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	void hobby() {
		System.out.println("playing game~");
	}
}
class Student extends Human{
	int grade;
	public Student(String name,int age,int grade) {
		super(name,age);
		this.grade=grade;
	}
	void info() {
		super.info();
		System.out.println("grade:"+grade);
	}
	void hobby() {
		System.out.println("studying~");
	}
	void school() {
		System.out.println("I spend most of my time at school.");
	}
}