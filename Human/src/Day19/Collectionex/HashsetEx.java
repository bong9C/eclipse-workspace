package Day19.Collectionex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("java");
		set.add("jdbc");
		set.add("servelet");
		set.add("spring");
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String elment =it.next();
			System.out.println(elment);
		}
		set.remove("jdbc");
		System.out.println("개수 : " + set.size());
		
		it=set.iterator();
		while(it.hasNext()) {
			String elment =it.next();
			System.out.println(elment);
		
	}
		set.clear();
		if(set.isEmpty()) System.out.println("비어있음");

}
}
