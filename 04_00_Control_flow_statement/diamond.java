import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        int dia_count,dia_size,space,star;
		Scanner sc =new Scanner(System.in);
		System.out.print("how many diamond do you want to make?");
		dia_count=sc.nextInt();
		System.out.print("what size diamond do you want to make?");
		dia_size=sc.nextInt();
		
		for (int i =0; i<dia_count;i++) {
			for (int j=0;j<dia_size;j++) {
				space=dia_size-j-1;
				star=j*2+1;
				for (int k=0;k<space;k++) {
					System.out.print(" ");
				}
				for (int k=0;k<star;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for (int j=dia_size-1;j>0;j--) {
				space=dia_size-j;
				star=(j-1)*2+1;
				for (int k=space;k>0;k--) {
					System.out.print(" ");
				}
				for (int k=star;k>0;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
    }
}
