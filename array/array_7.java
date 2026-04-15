package array;

// Subarray -> brute force
public class array_7 {

    public static void subArray(int array[]){
        int largest_sum = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length ; i++){
            for(int j=i ; j<array.length ; j++){
                int sum = 0;
                
                for(int k=i ; k<=j ; k++){
                    System.out.print(array[k] + " ");
                    sum = sum + array[k];
                }
                System.out.println(" --> sum = " + sum);
                System.out.println();
                if(sum > largest_sum){
                    largest_sum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("largest sum is " + largest_sum);
    }

    public static void kadens(int arr[]) {
    int max_sum = Integer.MIN_VALUE;
    int current_sum = 0;

    int start = 0, end = 0, tempStart = 0;

    for (int i = 0; i < arr.length; i++) {

        current_sum += arr[i];

        if (current_sum > max_sum) {
            max_sum = current_sum;
            start = tempStart;
            end = i;
        }

        if (current_sum < 0) {
            current_sum = 0;
            tempStart = i + 1; // next possible start
        }
    }

    System.out.println("Maximum sum: " + max_sum);

    System.out.print("Subarray: ");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i] + " ");
    }
}

    public static void main(String[] args){
        int array[] = {1,5,-2,1,-3,-2};
        kadens(array);
    }
}
