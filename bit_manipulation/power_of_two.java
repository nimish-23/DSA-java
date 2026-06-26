package bit_manipulation;

public class power_of_two {
    public static void main(String[] args){
        int n = 15;

        if((n & (n-1)) == 0){
            System.out.println(n + " is power of 2 number.");
        }
        else{
            System.out.println(n + " is not power of 2 number.");
        }
    }
}
