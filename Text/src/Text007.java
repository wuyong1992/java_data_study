
/**
 * 利用for循环直接求出个数
 * @author Administrator
 */

public class Text007 {
	Integer i, j;

	public void aliquot(Integer i, Integer j) {
		this.i = i;
		this.j = j;
		Integer all = 0;

		int x = 0;
		for (int k = 0; k <= i; k++) {
			if (k % j == 0) {
				x++;
				all = all + k;
			}
		}
		Double SUM = (double) all / x;
		System.out.println(all);
		System.out.println(x);
		System.out.println(SUM);

	}

}
