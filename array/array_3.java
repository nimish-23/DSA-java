package array;

// largest number
public class array_3 {

    public static int largest_num(int array[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length ; i++){
            if(array[i] > largest){
                largest = array[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int array[] = {2,5,6,8,9,7,4,3}; 
        int largest_num = largest_num(array);
        System.out.println("largest number in array is " + largest_num);
    }
}
