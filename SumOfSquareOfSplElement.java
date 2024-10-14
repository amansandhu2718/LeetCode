import java.util.ArrayList;

public class SumOfSquareOfSplElement {
    
    public static void main(String[] args) {
        int arr[]=new int[]{2,7,1,19,18,3};
        System.out.println(sumOfSquares(arr));
    }

    public static int sumOfSquares(int[] nums) {
        
        int n=nums.length;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if(n%(i+1)==0){
                System.out.println(nums[i]);
                sum=sum+nums[i]*nums[i];
            }
        }

        return sum;
    }
}

