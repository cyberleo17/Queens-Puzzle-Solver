import java.util.ArrayList;

public class QueensPuzzleSolver {
	public static void main(String[] args) {
		int noOfQueens = 8;
		ArrayList<Integer> input = new ArrayList<Integer>();
		ArrayList<Integer> sum = new ArrayList<Integer>();

		for (int i = 1; i <= noOfQueens; i++) {
			input.add(i);
		}
		System.out.println("Eight-Queens Puzzle - Chong Yi Chin");
		System.out.println("");
		PuzzleSolve.<Integer>solve(8, sum, input, new TestClass<Integer>());
	}

	private static class TestClass<Integer> implements PuzzleTest<Integer> {
		public boolean test(ArrayList<Integer> candidate) {
			for (int q1 = 0; q1 < candidate.size() - 1; q1++) {
				for (int q2 = q1 + 1; q2 < candidate.size(); q2++) {
					int x1 = q1;
					int y1 = (int) candidate.get(q1);
					int x2 = q2;
					int y2 = (int) candidate.get(q2);

					if (Math.abs(y2 - y1) == Math.abs(x2 - x1)) {
						return false;
					}
				}
			}
			return true;
		}

		int count = 1;

		public void foundSolution(ArrayList<Integer> solution) {
			System.out.println("Solution #" + count);
			for (int q1 = 0; q1 < solution.size(); q1++) {// rows
				for (int q2 = 1; q2 <= solution.size(); q2++) {// col
					if (q2 == (int) solution.get(q1)) {
						System.out.print("Q ");
					} else {
						System.out.print(". ");
					}
				}
				System.out.print("\n");
			}
			count++;
			System.out.println(" ");
		}
	}
}
