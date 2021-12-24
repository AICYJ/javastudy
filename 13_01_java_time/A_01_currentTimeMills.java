public class A_01_currentTimeMills {
    public static void main(String[] args) {
		long start=System.currentTimeMillis();//시스템에 있는 클래스임
		System.out.println("start time: "+start);
		int a=0;
		for(int i=1;i<10000000;i++) {
			a++;
		}
		long end=System.currentTimeMillis();
		System.out.println("end time: "+end);
		double runtime=((double)end-start)/1000;
		System.out.println("The working time:"+runtime+"s");
	}
}
