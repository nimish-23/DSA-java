package recursion;

public class recursion_basic {

    public static void copy(int n){
        // base condition check
        if(n == 1){
            System.out.println("base condition -> " + n);
            return;
        }
        //task before function call
        System.out.println("call before function call ->" + n);
        //function call
        copy(n-1);
        // task after function call
        System.out.println("call after function call ->" + n);
    }

    public static void main(String args[]){
        copy(10);
    }

}
