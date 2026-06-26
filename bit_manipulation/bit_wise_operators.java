package bit_manipulation;

public class bit_wise_operators {
    public static void main(String[] args){
        System.out.println("AND operator -> 5 & 6 = " +  (5 & 6));
        System.out.println("OR operator -> 5 | 6 = " + (5 | 6));
        System.out.println("XOR operator -> 5 ^ 6 = " + (5 ^ 6));
        
        // in one's complement +ve becomes -ve and -ve becomes +ve
        System.out.println("one's complement -> ~5 = " + (~5));
        System.out.println("one's complement -> ~-2 = " + (~-2));

        System.out.println("left shift -> 5 << 2 = " + (5 << 2));
        System.out.println("right shift -> 6 >> 1 = " + (6 >> 1));
    }
}
