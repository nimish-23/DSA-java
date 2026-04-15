package array;

// Binary Search
public class array_4 {

    public static int BinarySearch(int array[], int key){
        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2; // industry standard

            if(array[mid] == key){
                return mid;
            }
            if(array[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6,7,8,9};
        int key = 5;
        int index = BinarySearch(array, key);
        System.out.println("index of " + key + " is " + index);
    }
}
