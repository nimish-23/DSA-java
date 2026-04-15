package functions;

// Function Overloading
public class fun_4 {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1.5,1.5));
    }
}
