package array;

// Pairs in an array
public class array_6 {
    public static void main(String[] args){
        int array[] = {2,4,6,8,10};

        for(int i=0 ; i<array.length ; i++){
            for(int j=i+1 ; j<array.length ; j++){
                System.out.print("pair:(" + array[i] +" , " + array[j] + ") ");
            }
            System.out.println(" ");
        }
    }
}
