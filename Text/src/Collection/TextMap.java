package Collection;

import java.util.HashMap;

public class TextMap {

	public static void main(String[] args) {
		
		HashMap<Long, Integer> hMap = new HashMap<Long, Integer>();
		
		System.out.println("hMap的长度："+hMap.size());
		
		hMap.put(10L, 100);
		hMap.put(11L, 110);
		hMap.put(12L, 120);
		hMap.put(13L, 120);
		
		System.out.println(hMap);
		
		System.out.println("key是10L对应的value值："+hMap.get(10L));
		
		hMap.remove(11L, 110);
		System.out.println("删除11L = 110 后："+hMap);
		
		/*Set i = hMap.keySet();	//将hMap中的kay键集合成Set集,并赋值给i
		System.out.println(i);*/
		
		System.out.println(hMap.keySet());	//将hMap中key以Set集的方式打印
		System.out.println(hMap.values());	//将hMap中value以数组的方式打印
		
		hMap.entrySet();
		System.out.println(hMap.entrySet());
		
		
	}

}
