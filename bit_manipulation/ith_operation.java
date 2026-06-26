package bit_manipulation;

public class ith_operation {
    public static void get_ith_bit(int n,int i){
        int bitmask = 1 << i;

        if((n & bitmask) == 0){
            System.out.println(i + "th bit is 0");
        }
        else{
            System.out.println(i + "th bit is 1");
        }
    }

    public static int set_ith_bit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clear_ith_bit(int n, int i){
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int update_ith_bit(int n, int i, int newbit){
        // if(newbit == 0){
        //     return clear_ith_bit(n, i);
        // }
        // else{
        //     return set_ith_bit(n, i);
        // }

        n = clear_ith_bit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clear_last_i_bits(int n, int i){
        int bitmask = -1 << i;
        return n & bitmask;
    }

    public static int clear_bit_range(int n, int i, int j){
        int a = -1 << (j+1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String[] args){
        System.out.println(clear_bit_range(10, 2, 4));
    }
}
