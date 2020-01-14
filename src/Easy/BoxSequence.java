package Easy;

public class BoxSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(boxSeq(0));

		System.out.println(boxSeq(1));

		System.out.println(boxSeq(2));
	}

	public static int boxSeq(int step) {
		int boxes = 0;
		if (step % 2 == 0) {
			boxes = step;
		} else {
			boxes = step + 2;
		}
		return boxes;
	}
}
