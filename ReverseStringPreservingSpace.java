public class ReverseStringPreservingSpace {
    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        String s=reverseWords(str);
        System.out.println(s);

    }
    public static String reverseWords(String s) {

        String arr[]=s.split(" ");
        StringBuilder s1=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            s1.append(ReverseString(arr[i])+" ");
        }
        return s1.substring(0,s1.length()-1).toString();
    }

    public static String ReverseString(String s){

        
        
        char [] arr= new char[s.length()];
        for (int i = 0; i <s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        int low=0;
        int high=s.length()-1;
        while(low<=high){
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}
