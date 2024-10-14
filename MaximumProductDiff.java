public class MaximumProductDiff {
    public static void main(String[] args) {
        
        int arr[]=new int[]{9,10,2,5,8,1};
        int a=maxProductDifference(arr);
        System.out.println(a);
    }
    public static int maxProductDifference(int[] nums) {
        
        int max = nums[0];
        int inxMax=0;
        int min= nums[0];
        int inxMin=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
              max=nums[i];
              inxMax=i;
            }
            if(nums[i]<min){
                min=nums[i];
                inxMin=i;
            }
        }

        int smax=min;
        int smin = max;

        for (int i = 0; i < nums.length; i++) {



            if(nums[i]!=max){
                if(smax<nums[i]){
                    smax=nums[i];
                }
            }else if(nums[i]==max && i!=inxMax){
                smax=nums[i];
            }


            if(nums[i]!=min){
                if(nums[i]>min && nums[i]<smin){
                    smin=nums[i];
                }
            }
            if(nums[i]==min && i!=inxMin){
                smin=nums[i];
            }
        }

        // System.out.println(" max "+ max +" smax"+ smax+" min"+ min +" smin"+ smin );
        return (max*smax)-(min*smin);

    }
}
