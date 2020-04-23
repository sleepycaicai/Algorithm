public class Solution {
    public static  int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }

        if (target == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int res = 0;
        for (int i = 2; i < target; i++) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }
        return res;

    }

    public static void main(String[] args) {

        System.out.println(  Solution.JumpFloor(1));
    }
}