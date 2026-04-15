package Assignment.A1;
//is the number paloindrome
public class q3 {

    public static boolean IsPalindrome(int n){
        int reverse = 0;
        int og_num = n;
        while (n > 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n/10;
        }
        return og_num == reverse;
    }
    public static void main(String[] args){
        System.out.println(IsPalindrome(123));
    }
}
