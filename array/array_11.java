package array;

//Move all Zeros to the end of the array
public class array_11 {

    public static void moveZero(int arr[]){
        int j = -1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 0){
                j= i;
                break;
            }
        }

        if(j == -1) return;

        for(int i=j+1 ; i<arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,0,3,0,4,5};
        moveZero(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
