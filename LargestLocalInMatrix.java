public class LargestLocalInMatrix {
 
    public static void main(String[] args) {
         
    int arr[][]=new int [][] {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
    int arr2[][]=largestLocal(arr);


    for (int i = 0; i < arr2.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(""+arr2[i][j]);
        }
        System.out.println();
    }


    }

    public static int[][] largestLocal(int[][] grid) {
     
        int n=grid.length;
        int arr[][]=new int [n-2][n-2]; 
        


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=FindMax(i,i+2, j,j+2,grid);
            }
        }

        return arr;
    }

    public static int FindMax(int si, int ei, int sj,int ej,int arr[][]){

        int max=arr[si][sj];
        for (int i = si; i <=ei; i++) {
            for (int j = sj; j <=ej; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

   
}
