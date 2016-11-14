import java.util.ArrayList;

/**
 * 利用ArrayList求个数
 * @author Administrator
 *
 */
public class Text00701 {
	Integer i, j;

	public void aliquot(Integer i, Integer j) {
		this.i = i;
		this.j = j;
		Integer all = 0;

		ArrayList<Integer> a = new ArrayList<>();
		for (int k = 0; k <= i; k++) {
			if (k % j == 0) {
				a.add(k);
				all = all + k;
			}
		}
		System.out.println(a.size());
		System.out.println(all);
		Double SUM = (double) all/a.size();
		System.out.println(SUM);
		
	}

}
