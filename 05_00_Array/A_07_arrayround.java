public class A_07_arrayround {
    public static void main(String[] args) {
		int[] startarr= {1,2,3,4,5,6,7,8,9,10};
		int[] endarr=new int[10];
		for (int i=0;i<startarr.length;i++) {
			for (int j=0;j<endarr.length;j++) {
				int a= (i+j)%10;
				endarr[j]=startarr[a];
			}
			System.out.println(Arrays.toString(endarr));
		}
	}
}
