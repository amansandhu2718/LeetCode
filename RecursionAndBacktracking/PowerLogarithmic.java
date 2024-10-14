
public class PowerLogarithmic {
    public static void main(String[] args) {
        
        int x=2;
        int n=3;
        int res=Recursion(x,n);
        System.out.println(""+res);
    }

    public static int Recursion(int x , int n){
        if(n==0){
            return 1;
        }
        // x raised to power n/2
        int xpnby2 = Recursion(x, n/2); 
        int res=xpnby2*xpnby2;
        if(n%2==1){
            res=res*x;
        }
        return res;
    }
}
