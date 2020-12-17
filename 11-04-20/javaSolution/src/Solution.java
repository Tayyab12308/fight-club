import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
  private static final int MOD_VALUE = (int) Math.pow(10, 9) + 7;
  private HashMap<ArrayList<Integer>, Integer> memo = null;

  private enum Directions {
    Left(new int[]{0, -1}),
    Right(new int[]{0, 1}),
    Up(new int[]{-1, 0}),
    Down(new int[]{1, 0});

    private final int[] val;
    Directions(int[] val) { this.val = val; }
  }

  public int findPathsBruteForce(int m, int n, int N, int i, int j) {
    if (i < 0 || i >= m || j < 0 || j >= n) { return 1; }
    if (N == 0) { return 0; }

    int count = 0;
    for (Directions direction : Directions.values()) {
      count += findPathsBruteForce(m, n, N - 1, i + direction.val[0], j + direction.val[1]);
    }

    return count % MOD_VALUE;
  }

  public int findPathsFast(int m, int n, int N, int i, int j) {
    if (memo == null) { memo = new HashMap<>(); }

    ArrayList<Integer> key = new ArrayList<>(Arrays.asList(N, i, j));
    if (memo.containsKey(key)) { return memo.get(key); }

    if (i < 0 || i >= m || j < 0 || j >= n) { return 1; }
    if (N == 0) { return 0; }

    int count = 0;
    for (Directions direction : Directions.values()) {
      count += findPathsFast(m, n, N - 1, i + direction.val[0], j + direction.val[1]);
    }

    memo.put(key, count % MOD_VALUE);
    return memo.get(key);
  }
}
