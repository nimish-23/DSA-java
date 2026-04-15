package array;

// is array sorted
public class array_8 {

    public static boolean isSorted(int array[]){
        for(int i=1 ; i<array.length ; i++){
            if(array[i-1] <= array[i]){

            }else{
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args){
        int array[] = {1,2,3,9,5,6};
        System.out.println(isSorted(array));
    }
}
