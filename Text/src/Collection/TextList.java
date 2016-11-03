package Collection;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TextList {

	public static void main(String[] args) {
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		//添加数组之前打印数组的长度
		System.out.println("添加元素前数组的长度："+intlist.size());
		
		//利用for循环为intlist赋值，
		for (int i = 10; i <= 15; i++) {
			intlist.add(i);
		}
		System.out.println(intlist);	//答应intlist容器中的数组
		
		//删除摸一个元素
		intlist.remove(2);
		System.out.println("删除数组中的第三个元素："+intlist);
		
		System.out.println("添加元素后数组的长度："+intlist.size());
		
		System.out.println("获取intlist中的第二位元素："+intlist.get(1));
		
		//intlist.set(要替换的元素索引, 要在指定位置存储的元素)
		intlist.set(0, 20);
		System.out.println("修改intlist中的第一位元素："+intlist);
		
		System.out.println("判断是否为空："+intlist.isEmpty());
		
		/*intlist.clear();
		System.out.println("清空intlist后获得的数组："+intlist);
		System.out.println("判断是否为空："+intlist.isEmpty());*/
		
		List<Integer> intlist2 = new ArrayList<Integer>();
		intlist2.add(18);
		intlist2.add(19);
		intlist2.add(20);
		System.out.println("intlist2中的元素："+intlist2);
		
		intlist.addAll(intlist2);
		//System.out.println("把intlist2中的元素全部放进intlist中："+intlist);
		intlist.removeAll(intlist2);
		System.out.println("从intlist中去除intlist2中含有的元素："+intlist);
		
		
		
	}

}
