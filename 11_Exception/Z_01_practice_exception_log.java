public class Z_01_practice_exception_log {
    // this program is divide calculator error log correct program
    static int divide(int a, int b) {
		return a/b;
	}
	static double divide(double a, double b) {
		return a/b;
	}

	public static void main(Stringex[] args) {
		
		StringBuffer log=new StringBuffer("");
		Stringex end;
		int result,calculator;
		int stop=1;
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(stop==1) {
			System.out.println("Number 1: calculation, number 2: done.");
			stop=sc.nextInt();
			if (stop==1) {
				
			}else{
				break;
			}
			try {
				System.out.println("Number 1: int calculation, number 2: double calculation.");
				calculator=sc.nextInt();
				if (calculator==1) {
					System.out.println("Enter two int numbers to calculate.");
					int a=sc.nextInt();
					int b=sc.nextInt();
					System.out.println("a divided by b is "+divide(a,b));
					end=count+" calculation result is: "+divide(a,b)+"\n";
					log.append(end);
					System.out.println(count+"calculation result is: "+divide(a,b)+"\n");
				}else {
					System.out.println("Enter two double numbers to calculate.");
					double a=sc.nextDouble();
					double b=sc.nextDouble();
					System.out.println("a divided by b is "+divide(a,b));
					end=count+" calculation result is: "+divide(a,b)+"\n";
					log.append(end);
					System.out.println(count+" calculation result is: "+divide(a,b)+"\n");
				}
				count++;
			}catch(Exception e){
				end=count+" calculation was an error.\n"+e.getMessage()+e.getStackTrace();
				System.out.println(end);
				log.append(end);
			}
		}
		System.out.println(log);
		}

	}