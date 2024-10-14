public class TwoSum {
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4,5,6,6,7,8};
        int target = 12;

        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]<target)
            {
                low++;
            }else if (arr[low]+arr[high]>target){
                high--;
            }
            else{
                System.out.println("Res "+ arr[low] +" ,"+ arr[high]);
                low++;
                high--;
            }
        }
    }
}
