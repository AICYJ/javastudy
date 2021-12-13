public class A_01_innerclass {
    
}
class A{
	static class StaticInner{}
	class InstaceInner{}
	
	StaticInner st1= new StaticInner();
	InstaceInner ii1= new InstaceInner();
	
	static void StaticMethod() {
		StaticInner st2 =new StaticInner();
//		The static method is not accessible to instant members.
//		InstaceInner ii2 =new InstaceInner();
	}
	void InstanceMethod() {
//		Both(static and normal) can be produced on the void.
		StaticInner st3 =new StaticInner();
		InstaceInner ii3 =new InstaceInner();
	}
}