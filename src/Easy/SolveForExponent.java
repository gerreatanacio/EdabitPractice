package Easy;

public class SolveForExponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solveForExp(2, 1024));
	}

	public static int solveForExp(int a, int b) {
		int x = 0;
		int product = 1;
		while (product <= b) {
			product = product * a;
			x++;
		}
		return x - 1;
	}

}
