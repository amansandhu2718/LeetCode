public class PartitionArray {
    public static void main(String[] args) {
        
        int [] arr= new int []{2,3,4,5,6,1,3,2,4,5};
        // 1 2 2 3 3 4 4 5 5 6
        int index = Partition(arr,5);
        System.out.println(index);

    }

    public static int Partition(int arr[], int pivot){

        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
}
