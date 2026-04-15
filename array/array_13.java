package array;

public class array_13 {

    public static int maxSubArray(int arr[], int k){
        int max_size = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;

            for(int j = i; j < arr.length; j++){
                sum += arr[j];

                if(sum == k){
                    int size = j - i + 1;
                    max_size = Math.max(max_size, size);
                }
            }
        }

        return max_size;
    }

    public static void main(String[] args){
        int arr[] = {10, 5, 2, 7, 1, 9};
        int result = maxSubArray(arr, 15);
        System.out.println(result);
    }
}