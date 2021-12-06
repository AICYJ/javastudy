public class A_05_array_foreach {
    public static void main(String[] args) {
        String a[]= {"Java","Hello","Programming"};
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for (String i:a) {
			System.out.println(i);
		}
		int b []= {1,2,3,4,5};
		for (int i:b) {
			System.out.print(i);
		}
    }
}
