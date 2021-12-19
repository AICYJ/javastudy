public class A_01_random {
    public static void main(String[] args) {
		Random random =new Random(); //The seed value is entered in the current time.
		Random random2 =new Random(); //The seed value is entered in the current time.
		Random random3 =new Random(2); // seed:2
		Random random4 =new Random(2); // seed:2
		System.out.println(System.currentTimeMillis());
		for (int i =0 ;i<5;i++) {
			System.out.println("raondom:"+random.nextInt(10));
		}
		for (int i =0 ;i<5;i++) {
			System.out.println("Raondom2:"+random2.nextInt(10));
		}
		for (int i =0 ;i<5;i++) {
			System.out.println("random3:"+random3.nextInt(10));
		}
		for (int i =0 ;i<5;i++) {
			System.out.println("random4:"+random4.nextInt(10));
		}
	}
}
