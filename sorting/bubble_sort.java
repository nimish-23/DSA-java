package sorting;

public class bubble_sort {

    public static void bubbleSort(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            boolean swap = false;
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {2,1,3,4,5};
        bubbleSort(arr);
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
