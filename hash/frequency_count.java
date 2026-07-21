package hash;

public class frequency_count {
    public static void main(String args[]){
        int nums[] = {1,1,2,3,2,4,1};
        int hash[] = {0,0,0,0,0,0,0};

        for(int i=0; i<nums.length; i++){
            hash[nums[i]] += 1;
        }

        for(int i=0; i<nums.length; i++){
            System.out.println(hash[i]);
        }
    }
}
