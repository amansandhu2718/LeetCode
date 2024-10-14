public class MaxProductOfTwo {
    public static void main(String[] args) {
        int arr[]=new int[]{3,4,5,2};
        int a=maxProduct(arr);
        System.out.println(a);
    }

    public static int maxProduct(int[] nums) {
        
        int max = nums[0];
        int inxMax=0;
        int min= nums[0];


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
              max=nums[i];
              inxMax=i;
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }

        int smax=min;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=max){
                if(smax<nums[i]){
                    smax=nums[i];
                }
            }else if(nums[i]==max && i!=inxMax){
                smax=nums[i];
            }
        }
        return ((max-1)* (smax-1));
    }
}
