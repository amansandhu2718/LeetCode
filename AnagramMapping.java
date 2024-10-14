import java.util.HashMap;

public class AnagramMapping {
    public static void main(String[] args) {
        
        int A[]=new int []{12, 28, 46, 32, 50};
        int B[]=new int []{50, 12, 32, 46, 28};

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        for (int i = 0; i < A.length; i++) {
            B[i]= map.get(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }



    }

}
