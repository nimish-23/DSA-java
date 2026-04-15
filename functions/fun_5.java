package functions;

public class fun_5 {
    public static boolean IsPrime(int n){
        for(int i=2 ; i<=(n-1) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //prime numbers in range
    public static void PrimeRange(int n){
        for(int i=2 ; i<=n ; i++){
            if(IsPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        // System.out.println(IsPrime(13));
        PrimeRange(10);
    }
}
