//704. 二分查找
//给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，
//写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。

class Solution {
    public int search(int[] nums, int target) {
       //升序数组
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right-left)/2;
            // int mid = (left + right)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
