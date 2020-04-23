public class Solution {
    public static int JumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
      int f1=1;
        int res=0;
        for(int i=1;i<target;i++){
            res=2*f1;
            f1=res;
        }
        return res;
    }


    public static void main(String[] args) {
     System.out.println(   Solution.JumpFloorII(3));

    }
}