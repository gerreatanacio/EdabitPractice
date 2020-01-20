package Easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(same(new int[] { 1, 3, 4, 4, 4 }, new int[] { 2, 5, 7 }));
	}

	public static boolean same(int[] a1, int[] a2) {

		Set<Integer> firstHash = new HashSet<Integer>();

		for (int i = 0; i < a1.length; i++) {
			firstHash.add(a1[i]);
		}

		Set<Integer> secondHash = new HashSet<Integer>();

		for (int i = 0; i < a2.length; i++) {
			secondHash.add(a2[i]);
		}
		return firstHash.size() == secondHash.size();
	}
}
