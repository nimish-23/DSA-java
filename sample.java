import java.util.ArrayList;

public class sample {
    public static void main(String args[]){
        int[] arr = {1,5,9,8,10,7};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}