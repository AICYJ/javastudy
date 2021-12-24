public class A_02_Decimalformat {
    public static void main(String[] args) {
		String[] pattern= {
				"###.###",
				"000.000",
				"-000.000",
				"######.##%"};
		double[] ar= {1.5,3.14,534.342,999};
		for (int p=0;p<pattern.length;p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);
			System.out.println("☆★☆★"+pattern[p]+"☆★☆★");
			for (int i =0; i<ar.length;i++) {
				System.out.println(d.format(ar[i]));
			}
		}
		
	}
}
