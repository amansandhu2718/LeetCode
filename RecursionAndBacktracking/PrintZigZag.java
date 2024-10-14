
public class PrintZigZag {
   public static void main(String[] args) {
    int n=2;
    Recusrion(n);
   } 

   public static void Recusrion(int n){
        if(n==0){
        return;
        }
    System.out.println(" PRE "+n);
    Recusrion(n-1);
    System.out.println(" IN "+n);
    Recusrion(n-1);
    System.out.println(" POST "+n);
   }
}
