package string;

public class compression {
    
    public static String compress_string(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int count = 0;
            while(i < str.length() && str.charAt(i) == ch){
                count++;
                i++;
            }
            i--;
            if(count > 1){
                sb.append(ch);
                sb.append(count);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String str = "aaaabbbcc";
        System.out.println(compress_string(str));
    }
}
