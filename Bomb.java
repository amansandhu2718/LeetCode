
public class Bomb {
    
    public static void main(String[] args) {
        int arr[]=new int[]{2,4,9,3};
        arr=decrypt(arr, -2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] decrypt(int[] code, int k) {
        int n=code.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
           int sum=0;
           if(k<0){
            for (int j = 1; j <= -1*k; j++) {
                sum=sum+code[(i+j)%n];
            }
           }else{
            for (int j = 1; j <= k; j++) {
                sum=sum+code[(i+j)%n];
            }
           }
            
            res[i]=sum;            
        }
        return res;
        
    }
}

