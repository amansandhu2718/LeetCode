public class ZeroOneTwo{
    public static void main(String[] args) {
        int [] arr = new int[]{1,0,0,2,1,1,1,1,2,0,0,2,0,1};
        System.out.println("aman");
        // 0,0,1,1, 1,0,2,1,1,1,2,0,0,2,0,1

        int i=0;
        int j=0;
        int k=arr.length-1;

        while(i<=k){
            if(arr[i]==0){
                swap(i,j,arr);
                j++;
                i++;
            }else if(arr[i]==1){
                i++;
            }else{
                swap(i, k, arr);
                k--;
            }

        }
        for(int m=0;m<arr.length;m++){
            System.out.println(""+arr[m]);
        }

    }

    public static void swap(int i , int j , int [] arr){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
