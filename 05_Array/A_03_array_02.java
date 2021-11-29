import java.util.Scanner;

public class A_03_array_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int scores[][]=new int[4][3];
		String subject[]= {"math","english","science"};
		for(int i=0;i<scores.length;i++) {
			System.out.println("Number "+(i+1)+", student's score. -----");
			for (int j=0;j<scores[i].length;j++) {
				System.out.print(subject[j]+":");
				//2D index can be used to store values in a 2D array.
				scores[i][j] =sc.nextInt();	}
		}
		System.out.println("\tmath\tenglish\tscience");
		for(int i=0;i<scores.length;i++) {
			System.out.print(i+1+"student's: \t");
			for (int j=0;j<scores[i].length;j++) {
				//2D index can be used to output values in a 2D array.
				System.out.print(scores[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
    }
}
