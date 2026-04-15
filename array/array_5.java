package array;

// Reverse array
public class array_5 {

    public static void reverse(int array[]){
        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int array[] = {1,2,3,4,5,6};
        reverse(array);
        
        for(int i=0 ; i<array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
