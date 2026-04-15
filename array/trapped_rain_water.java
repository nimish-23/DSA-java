package array;

public class trapped_rain_water {

    public static int trapedWater(int height[]){
        int n = height.length;
        //max left axuillary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1 ; i<n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //max rigth axuillary array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //teaped rain water
        int trapped_Water = 0;

        for(int i=0 ; i<n ; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            trapped_Water = trapped_Water + (waterLevel - height[i]);
        }
f
        return trapped_Water;
        
    }
    public static void main(String[] args){
        int height[] = {4,2,0,6,3,2,5};
    
        System.out.println( trapedWater(height));
    }
}
