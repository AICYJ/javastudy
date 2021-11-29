public class A_01_initarray {
    public static void main(String[] args) {
        int arint[]=new int [3];
		float arFloat[]=new float[3];
		double arDouble[]=new double[3];
		char arChar[]=new char[3];
		String arString[]=new String[3];
		//we can check array init value by below code
		for (int i=0;i<3;i++) {
			System.out.println(arint[i]+" ");
		}
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.println(arDouble[i]+" ");
		}
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.println(arFloat[i]+" ");
		}
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.println(arChar[i]+" ");
		}
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.println(arString[i]+" ");
		}
    }
}
