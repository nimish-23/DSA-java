package searching;

public class binary_serach {

    public static int binarySearch(int nums[], int target){
        int i = 0;
        int j = nums.length-1;
        while(i <= j){
            int mid = (i+j) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                i= mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return i;
    }
    public static void main(String[] args){
        int nums[] = {1,3,5,6,7};
        int result = binarySearch(nums, 2);
        System.out.println(result);
    }
}
