public class QuickSort {
    
public static void main(String[] args) {
    
    int [] arr= new int []{2,3,4,5,6,1,3,2,4,5};

    // 1,3,2,4, 2,3,4,5,5, 6,
    Sort(arr,0,arr.length-1);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

public static void Sort(int arr[] , int low , int high){
    if(low>=high){
        return;
    }
    int pivot =arr[high];
    int pindex=Partition(arr,pivot,low,high);
    System.out.println("pindex: "+pindex+" p: "+ pivot );
    Sort(arr,low,pindex-1);
    Sort(arr,pindex+1,high);
}
    public static int Partition(int arr[], int pivot, int low , int high){

        int i=low;
        int j=low;
        while(i<=high){
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
