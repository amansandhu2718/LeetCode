
public class PowerLinear {
    public static void main(String[] args) {
    
        int num=2;
        int pow=3;
        int res=Recursion(num,pow);
        System.out.println(res);
    }

    public static int Recursion(int num,int pow){
        if(pow==0){
            return 1;
        }
        int numPoweMinusOneResult=Recursion(num,pow-1);
        int result=num*numPoweMinusOneResult;
        return result;
    }

}
