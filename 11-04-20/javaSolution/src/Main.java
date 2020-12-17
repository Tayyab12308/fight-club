import java.util.List;

public class Main {
  public static void main(String[] args) {
    int testCase1 = new Solution().findPathsBruteForce(2, 2, 2, 0, 0); // 6
    int testCase2 = new Solution().findPathsBruteForce(1, 3, 3, 0,  1); // 12
    System.out.println(testCase1);
    System.out.println(testCase2);

    int testCase3 = new Solution().findPathsFast(2, 2, 2, 0, 0); // 6
    int testCase4 = new Solution().findPathsFast(1, 3, 3, 0, 1); // 12
    int testCase5 = new Solution().findPathsFast(7, 6, 13, 0, 2);
    int testCase6 = new Solution().findPathsFast(1, 3, 3, 0, 1); // 12
    int testCase7 = new Solution().findPathsFast(8,50, 23, 5, 26); // for some reason gives the wrong answer
    System.out.println(testCase3);
    System.out.println(testCase4);
    System.out.println(testCase5);
    System.out.println(testCase6);
    System.out.println(testCase7);
  }
}
