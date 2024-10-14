import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        
        int arr1[]=new int[]{5,3};
        int arr2[]=new int[]{5,2,3,6,8};
        int []arr=nextGreaterElement(arr1,arr2);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(""+arr[i]);
        }

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    
            Stack<Integer > st = new Stack<>();
        HashMap<Integer,Integer > mp = new HashMap<>();
        st.push(nums2[nums2.length - 1]);
        mp.put(nums2[nums2. length - 1] ,-1);

        for (int i = nums2.length - 2; i >= 0; i--){
        while(st.size()> 0 && nums2[i] >= st.peek()){
            st. pop();
        }
        if(st.size() == 0){
            mp.put(nums2[i] ,-1);
        } else {
            mp.put(nums2[i] ,st.peek());
        }
        st. push(nums2[i]);
        }
        
        for(int i=0;i<nums1.length;i++){
            int res= mp.get(nums1[i]);
            nums1[i]=res;
        }

        return nums1;
 
    } 
}



