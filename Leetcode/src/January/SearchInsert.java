package January;
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while(left<=right){
            //As array is sorted we are going with the binary search approach 
            //Dividing the array into the two parts and then finding the mid
            mid=(right+left)/2;

            if(nums[mid]==target){
                //No need to go forward we got the position
                return mid;
            }else if(nums[mid]<target){
                //if array value is smaller than the targeted value
                //then we have to search from mid+1
                //if that value is not present the n left will 
                //update till it crosses right and loop will break
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
        // what left is showing is that we might get that value in this position
        return left;

    }
}
public class SearchInsert {
    
}
