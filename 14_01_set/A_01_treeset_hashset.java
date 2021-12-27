import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A_01_treeset_hashset {
    public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add("zoo");
		hs.add("demon");
		hs.add("banana");
		hs.add("apple");
		hs.add("tomato");
		hs.add("carge");
		TreeSet ts= new TreeSet();
		ts.add("zoo");
		ts.add("demon");
		ts.add("banana");
		ts.add("apple");
		ts.add("tomato");
		ts.add("carge");
		
		Iterator it =hs.iterator();
		System.out.println("<<print hashSet>>");
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println();
		Iterator it2 =ts.iterator();
		System.out.println("<<print TreeSet>>");
		while(it2.hasNext()) {
			System.out.print(" "+it2.next());
		}
		System.out.println();
		System.out.println("treeset size:"+ts.size());
	}

}
