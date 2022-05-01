package leetcode.contest;

class Solution1 {

    public int minimumAverageDifference(int[] nums) {

        if(nums.length == 1) return 0;


        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        int globalMin = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        int min = Integer.MAX_VALUE, index = 0;
        int n = prefix.length;

        for(int i = 0; i < prefix.length-1; i++){
            min = (int) Math.min(min, Math.abs(prefix[i]/(i+1) - (prefix[n-1] - prefix[i])/(n-i-1)));
            if(min != globalMin){
                index = i;
                globalMin = min;
            }
        }
        min = (int) Math.min(min, prefix[n-1]/n);
        if(min != globalMin){
            index = n-1;
            globalMin = min;
        }
        return index;
    }
}
public class MinimumAverageDifference {
}
