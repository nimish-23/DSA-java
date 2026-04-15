package functions;

public class fun_6 {

    //binary -> decimal
    public static int b_d(int binary_num){
        int power = 0;
        int decimal_num = 0;

        while(binary_num > 0){
            int last_digit = binary_num % 10;
            decimal_num = decimal_num + (last_digit * (int)Math.pow(2,power));
            power++;
            binary_num = binary_num/10;
        }
        return decimal_num;
    }

    //decimal -> binary
    public static int d_b(int decimal_num){
        int power = 0;
        int binary_num = 0;
        while (decimal_num > 0){
            int remainder = decimal_num % 2;
            binary_num = binary_num + remainder * (int)Math.pow(10,power);
            power++;
            decimal_num = decimal_num / 2;
        }
        return binary_num;
    }
    public static void main(String[] args){
       int decimal_num = b_d(100);
       System.out.println(decimal_num);

       int binary_num = d_b(5);
       System.out.println(binary_num);
    }
}
