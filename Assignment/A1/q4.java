package Assignment.A1;
// 123 -> 1+2+3 -> 6
public class q4 {

    public static int sum_of_digit(int n){
        int sum = 0;
        while (n > 0) {
            int last_digit = n % 10;
            sum = sum + last_digit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sum_of_digit(123));
    }
}
