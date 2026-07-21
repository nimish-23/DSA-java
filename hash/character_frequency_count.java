package hash;

public class character_frequency_count {
    public static void main(String args[]){
        int s[] = {'a','b','c','a','z','b'};
        int hash[] = new int[26];
        
        for(int i=0; i<s.length; i++){
            int idx = s[i] - 'a';
            hash[idx] += 1;
        }

        for(int i=0; i<hash.length; i++){
            System.out.println(hash[i]);
        }
    }   
}
