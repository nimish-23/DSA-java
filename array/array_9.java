package array;

//Left Rotate the Array by One
public class array_9 {

    public static void rotateArray(int arr[]){
        int temp = arr[0];
        for(int i=0 ; i<arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        rotateArray(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
