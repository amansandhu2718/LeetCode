import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        

        Stack <Character> st =new Stack<Character>();
        String s="((())))";
        int i=0;
        boolean res=false;
        while(i<s.length()){
            
             if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else {
                if( st.empty()){
                    res=true;
                    break;
                }
                if(st.peek()=='('){
                    st.pop();
                }
            }
            i++;
        }

        if(res){
            System.out.println("NO"); 
        }else{
            if(st.empty()){
                System.out.println("YES");
            }else{
               System.out.println("NO"); 
            }
        }
      


    }
}
