public class MergeTwoSortedArray {
    public static void main(String[] args) {
        
        int[] arr1=new int []{1,3,5,7,9};
        int[] arr2=new int []{2,4,5,6,10,11,12};
        int arr []= MergeSorted(arr1,arr2);
        System.out.println("ok");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(""+arr[i]);
        }

        // 1 2 3 4 5 5 6 7 9 10 11 12

    }
    public static int[] MergeSorted(int arr1[],int arr2[]){
       
       
        int NewArr[]=new int[arr1.length+arr2.length];

        int i=0;
        int j=0;
        int k=0;
        
        while(i<arr1.length && j<arr2.length ){

            if(arr1[i]<arr2[j]){
                NewArr[k]=arr1[i];
                i++;
            }else{
                NewArr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            NewArr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            NewArr[k]=arr2[j];
            j++;
            k++;
        }
        return NewArr;
    }
}
