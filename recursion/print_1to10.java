package recursion;

public class print_1to10 {
    public static void print1to10(int n){
        // base case
        if(n == 1){
            System.out.println(n);
            return;
        }

        print1to10(n-1);
        System.out.println(n);
    }

    public static void main(String args[]){
        print1to10(10);
    }
}
