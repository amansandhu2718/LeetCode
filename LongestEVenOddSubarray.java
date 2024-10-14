public class LongestEVenOddSubarray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3};
        int threshold=5;

        int count=0;
        int i=0;
        while (i<arr.length){
            int j=i;
            while(j<arr.length){


                boolean isStartingIndexEven =false;
                int k=i;
                int lengthCount=0;
                if(arr[k] % 2 == 0){
                    isStartingIndexEven=true;
                    while (k<=j-1) {
                        if(arr[k]<=threshold ){
                            if( arr[k] % 2 != arr[k + 1] % 2){
                                System.out.print(arr[k]);
                                lengthCount++;
                            }
                        }
                        k++;
                    }
                System.out.println();
                }


                    if(isStartingIndexEven && lengthCount>0){
                        count++;
                    }
                j++;
            }
            i++;
        }
        System.out.println(count);
    }
}
























// public class LongestEVenOddSubarray {
//     public static void main(String[] args) {
        
        
//         int arr[]=new int[]{4,3,1};
//         // int arr[]=new int[]{2,7};
//         System.out.println(longestAlternatingSubarray(arr,4));

        
//     }


//     public static int longestAlternatingSubarray(int[] nums, int threshold) {
//         int res=0;
        

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {

//                 if(nums[i]%2!=0){
//                     break;
//                 }

//                 boolean areAllElementSmaller=true;
//                 boolean flag=false;
//                 int count=0;
//                 for (int j2 = i; j2 <=j; j2++) {
                    
//                     System.out.print(" ele "+nums[j2]);
                    
//                     if(( i==j || ( j2+1<=j && (nums[j2] % 2 != nums[j2 + 1] % 2))  ) ){
//                         System.out.println(" flag");
//                         flag=true;
//                     }

//                     if(nums[j2]>threshold){
//                         System.out.println("thres");
//                         areAllElementSmaller=false;
//                     }

                    
//                     count++;

//                 }
//                 System.out.println("-------------");
//                 if( areAllElementSmaller==true && flag==true){
//                     if(count>res){
//                         res=count;
//                     }
//                 }
//             }
            
            
//         }



//         return res;
//     }
// }
