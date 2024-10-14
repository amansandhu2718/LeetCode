import java.util.ArrayList;
import java.util.List;

public class AcronymOfWords {

    public static void main(String[] args) {
        List<String> s1=new ArrayList<String>();
        boolean a=isAcronym(s1,"");
        System.out.println(a);

    }
    
    public static boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).charAt(0)!=s.charAt(i)){
                return false;
            }
        }


        return true;
    }
}
