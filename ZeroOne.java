
public class ZeroOne {
    public static void main(String[] args) {
        int [] arr = new int[]{1,0,0,1,1,1,1,0,0,0,1};

        // 0,0,0,1,1,1,1,0,0,0,1


        int i=0;
        int j=0;

        while(i<arr.length){
            if(arr[i]==0){
                swap(i,j,arr);
                j++;
  
            }
            i++;
        }
        for(int m=0;m<arr.length;m++){
            System.out.println(arr[m]);
        }

    }

    public static void swap(int i , int j , int [] arr){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
