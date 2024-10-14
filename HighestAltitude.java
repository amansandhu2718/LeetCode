public class HighestAltitude {

    public static void main(String[] args) {

        // int arr[]=new int[]{44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        int arr[]=new int[]{-4,-3,-2,-1,4,3,2};
        int a=largestAltitude(arr);
        System.out.println("ans: "+a);
    }

    public static  int largestAltitude(int[] gain) {
        
        int arr[]=new int [gain.length+1];
        arr[0]=0;
        int max=arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1]=gain[i]+arr[i];

            if(arr[i]>max){
                max=arr[i];
            }

        }    
        if(arr[arr.length-1]>max){
            max=arr[arr.length-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(""+arr[i]);
        }
      
        return max ;
    }
}
