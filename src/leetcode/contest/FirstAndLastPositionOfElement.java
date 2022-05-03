package leetcode.contest;

class FirstAndLastPositionOfElement {
    int searchLeft(int[] nums, int left, int right, int target){
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    int searchRight(int[] nums, int left, int right, int target){
        while(left < right){
            int mid = left + (right - left)/2 + 1;
            if(nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        return left;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        int[] ans = new int[2];
        ans[0]  = -1; ans[1] = -1;
        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                //search left and right
                ans[0] = searchLeft(nums, left, mid, target);
                ans[1] = searchRight(nums, mid, right, target);
                return ans;
            }
            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] ans = (new FirstAndLastPositionOfElement().searchRange(new int[]{1,2,3,3,3,3,4}, 3));
        System.out.println(ans[0]+"   "+ans[1]);
    }
}
