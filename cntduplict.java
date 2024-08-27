
// import java.util.Map;
// import java.util.HashMap;
import java.util.*;

class cntduplict {
    public static boolean cntduplicte(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 2, 5, 7, 9, 6, 5 };
        System.out.println(cntduplicte(nums));
    }
}
