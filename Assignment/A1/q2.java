package Assignment.A1;
//Question2:WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.
public class q2 {

    public static boolean IsEven(int n){
        if(n%2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(IsEven(5));
    }
}
