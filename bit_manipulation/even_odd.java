package bit_manipulation;

public class even_odd {
    public static void even_odd_function(int n){
        int bitmask = 1;

        if((n & bitmask) == 0){
            System.out.println(n + " is even number");
        }
        else{
            System.out.println(n + " is odd number");
        }
    }

    public static void main(String[] args){
        even_odd_function(2);
        even_odd_function(5);
        even_odd_function(3);
    }

}
