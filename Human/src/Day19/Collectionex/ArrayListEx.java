package Day19.Collectionex;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java"); // 데이터 추가 
		list.add("JDBC");
		list.add("Serveit");
		int size=list.size(); // 저장 되어있는 갯수 확인 하는 법
		System.out.println("총 객체수 : " + size);
		System.out.println();
		String web=list.get(2);
		System.out.println("3번째:"+web);
		
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
			
		}
		list.remove(2);
		for(int i=0; i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		
		
	}

}
