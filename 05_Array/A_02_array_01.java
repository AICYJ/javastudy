public class A_02_array_01 {
    public static void main(String[] args) {
        int score1=100;
		int score2=80;
		int score3=70;
        //This code is output using variables.
		System.out.println("The first student's score:"+score1);
		System.out.println("The second student's score:"+score2);
		System.out.println("The third student's score:"+score3);
		//This code is output using an array.
		int scores[] =new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		System.out.println("The first student's score:"+scores[0]);
		System.out.println("The second student's score:"+scores[1]);
		System.out.println("The third student's score:"+scores[2]);
        // This code is output using an array and a repetition statement(for).
		for (int i=0;i<3;i++) {
			System.out.println("the"+i+1+"student's score:"+scores[i]);
		}
    }
}
