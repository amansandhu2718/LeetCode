public class TrapRainWater {
    public static void main(String[] args) {
        
        int arr[]=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }
    public static int trap(int[] arr) {


        int maxIndex=0;
        int max=arr[0];

        int minIndex=0;
        int min=arr[0];


        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("max : "+max+" min: "+min);
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max && arr[i]>min){
                min=arr[i];
                minIndex=i;
            }    
        }
        System.out.println("second max : "+min);

        int start=0;
        int end=0;
        if(minIndex>maxIndex){
            end=minIndex;
            start=maxIndex;
        }else{
            start=minIndex;
            end=maxIndex;
        }

        int count=0;
        for (int i = start; i < end; i++) {
            if(arr[i]<=min){
                count=count+min-arr[i];
            }
        }

        return count;
    }
}
