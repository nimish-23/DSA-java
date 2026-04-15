package functions;

public class fun_3 {

    public static int factorial(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int bino_coeff(int n, int r){
        int bc = factorial(n)/(factorial(r) * factorial(n-r));
        return bc;
    }
    public static void main(String[] args){
        int bc = bino_coeff(5, 2);
        System.out.println(bc);
    }   
}
