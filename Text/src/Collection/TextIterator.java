package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TextIterator {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("li");
		set.add("wu");
		set.add("zhang");
		
		//Iterator<String> iterator = set.iterator();
		for (Iterator<String> iterator = set.iterator();iterator.hasNext();) {
			//iterator.hasNext()返回值是boolean型
			//iterator.next()进过hasNest()判断是否有下一个，如果有则进行.next()，并输出这个元素
			System.out.println(iterator.next());
		}
		

	}

}
