public class sample{

    public static int maxOnes(int arr[]){
        int count = 0;
        int mcount = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 1){
                count++;
                mcount = Math.max(mcount, count);
            }else{
                count = 0;
            }
        }
        return mcount;
    }
    public static void main(String[] args){
        int arr[] = {1,1,0,1,1,1};
        int result = maxOnes(arr);
        System.out.println("max number of 1s are " + result);
    }
}