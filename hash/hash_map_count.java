package hash;
import java.util.HashMap;

public class hash_map_count {
    public static void main(String args[]){
        int nums[] = {1,1,2,3,2,4,1,2};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        System.out.println(map);
    }
}
