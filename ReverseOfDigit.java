public class ReverseOfDigit {
    public static void main(String[] args) {
        int a=0;
        int res=0;
        while(a!=0){
            int rem=a%10;
            System.out.println("rem:"+rem);
            res=res*10+rem;
            a=a/10;
        }
        System.out.println(res);
    }
}
