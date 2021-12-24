public class A_06_lotto {
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random random=new Random();
		int lottoAr[]=new int[6];
		int userAr[]=new int[6];
		int bonus, bonusUser;
		int count=0;
		for(int i=0; i<6;i++) {
			lottoAr[i]=random.nextInt(45)+1;
		}
		bonus=random.nextInt(45)+1;
		System.out.println("lotto num:"+Arrays.toString(lottoAr)+"bonus: "+bonus);
		System.out.print("Please enter 6 numbers:");
		for(int i=0; i<6;i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.print("enter bonus number:");
		bonusUser=sc.nextInt();
		for (int j=0;j<6;j++) {
			for (int i=0;i<6;i++) {
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		if (count==6) {
			System.out.println("Congratulations. You're in first place.");
		}
		else if(count==5) {
			if (bonus==bonusUser) {
				System.out.println("Congratulations. You're in second place.");
			}else {
				System.out.println("Congratulations. You're in third place.");
			}
			
		}else if(count==4) {
			System.out.println("Congratulations. You're in 4th place.");
		}else if(count==3) {
			System.out.println("Congratulations. I'm in 5th place.");
		}else {
			System.out.println("next time....");
		}
	}
}
