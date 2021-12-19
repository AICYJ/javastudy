import java.util.StringTokenizer;
//StringTokenizer must import the class to run.
public class A_03_stringToken {
    public static void main(String[] args) {
		String str="Choo:010-1234-1234:24";
		String delim=":";
		StringTokenizer st = new StringTokenizer(str,delim);
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.hasMoreTokens());
		
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.hasMoreTokens());
		
		
	}
}
