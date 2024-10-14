import java.util.HashMap;
import java.util.HashSet;

public class ArithmaticTriplets {
    public static void main(String[] args) {
        int arr[]=new int[]{};
        int ans=arithmeticTriplets(arr, 3);
        System.out.println(ans);
    }
    public static int arithmeticTriplets(int[] nums, int diff) {

            HashSet<Integer> map= new HashSet<Integer>();

            for (int i = 0; i < nums.length; i++) {
                map.add(nums[i]);
            }

            int count=0;
            for (int i = 0; i < nums.length; i++) {
                int num=nums[i];
                
                    if(map.contains(num+diff)){
                        if(map.contains(num+diff)){
                            count++;            
                        }
                    }
                
            }

            
        return count;
    }
}
