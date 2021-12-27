import java.util.HashMap;
import java.util.Scanner;

public class A_01_map {
    public static void main(String[] args) {
		HashMap<String,String> m =new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		m.put("apple", "red");
		m.put("paper", "tree");
		m.put("flower", "beautiful");
		
		String voca;
		System.out.println("Enter the word you want to know feature");
		voca=sc.nextLine();
		if(m.containsKey(voca)) {
			System.out.println("feature :"+m.get(voca));
		}else {
			System.out.println("There is no feature in the database for that word.");
		}
	}
}