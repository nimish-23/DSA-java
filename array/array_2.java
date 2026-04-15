package array;

public class array_2 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;

        // Linear search
        for(int i=0 ; i<array.length ; i++){
            if(array[i] == key){
                System.out.println(key + " on index " + i);
            }
        }
    }
}
