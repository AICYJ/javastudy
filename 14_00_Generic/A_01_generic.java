public class A_01_generic {
    public static void main(String[] args) {
		Value v = new Value();
		v.<Integer>typeSearch(3);
		v.typeSearch(3.14);
		v.typeSearch(3.14f);
		v.typeSearch('a');
		v.typeSearch("hel");
		v.typeSearch(true);
		
	}
}
class Value{
	public <T> void typeSearch(T x) {
		if (x instanceof Integer) {
			System.out.println(x+"is integer.");
		}
		else if (x instanceof Double|| x instanceof Float) {
			System.out.println(x+"is double.");
		}
		else if (x instanceof Character) {
			System.out.println(x+" is character.");
		}
		else if (x instanceof String) {
			System.out.println(x+" is string.");
		}
		else if (x instanceof Boolean) {
			System.out.println(x+" is boolean.");
		}
	}
}