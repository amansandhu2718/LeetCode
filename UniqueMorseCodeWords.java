import java.util.HashSet;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
    
        String str[]=new String[]{"gin","zen","gig","msg"};
        int a=uniqueMorseRepresentations(str);
        System.out.println(a);

    }

    public static int uniqueMorseRepresentations(String[] words) {
        String arr[]=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> map=new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String s="";
            for (int j = 0; j < words[i].length(); j++) {
                int a=words[i].charAt(j)-'a';
                s=s+arr[a];
            }
            map.add(s);

        }

        return map.size();
    }

    
}
