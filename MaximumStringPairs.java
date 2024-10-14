public class MaximumStringPairs {
    public static void main(String[] args) {
        
        String arr[]=new String[]{"cd","ac","dc","ca","zz"};
        System.out.println(""+maximumNumberOfStringPairs(arr));
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb=new StringBuilder(words[i]);
            String str=sb.reverse().toString();
            // System.out.println("sb: "+sb.toString());
            for (int j = i+1; j < words.length; j++) {
                if(words[j].equals(str)){
                    count++;
                }
            }
        }
        return count;
    }
}
