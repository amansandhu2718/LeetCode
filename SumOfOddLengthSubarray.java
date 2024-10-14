import java.util.ArrayList;

public class SumOfOddLengthSubarray {
    public static void main(String[] args) {
        
        int arr[]=new int[]{1,2,3};

        int sum=0; 
        int i=0;
        while (i<arr.length) {
            int j=i;




            while (j<arr.length ) {
                int length=((j-i)+1);
                int sumArraylist=0;
                int k=i;
                
                if(length%2!=0){
                    System.out.println("diff : "+((j-k)+1));
                    while (k<=j) {

                        sumArraylist=sumArraylist+arr[k];
                        k++;
                    }
                        sum=sum+sumArraylist;
                }
                j=j+2;
              
            }




            i++;
        }
        System.out.println("sum:" + sum);
      
    }
}
