package string;

public class is_palindrom {

    public static boolean is_palindrom_fun(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 

    public static void main(String[] args){
        String str = "no";
        System.out.println(is_palindrom_fun(str));
    }
}
