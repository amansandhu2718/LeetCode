import java.util.HashMap;

public class PairsWithAbsoluteDifference {
    public static void main(String[] args) {
        
        int arr[]=new int []{2,3,2,10,3,9,4,9,5,8};

        int a = countKDifference(arr,1);
        System.out.println(a);

       
        


    }
    public static int countKDifference(int[] nums, int k) {
       
        int count=0;

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }


System.out.println(""+map);

        for (int i = 0; i < nums.length; i++) {
            int diff=nums[i]-k;

            if(map.containsKey(diff)){
                count=count+map.get(diff);                
            };
        }


        return count;
    }
}
