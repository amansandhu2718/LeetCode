public class DiagonalSum {
 public static void main(String[] args) {
    
    int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    int ans=diagonalSum(arr);
    System.out.println(ans);
 }
    public static int diagonalSum(int[][] mat) {
        
        int sum=0;


        
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if(i==j || i+j==mat.length-1){
                        sum=sum+mat[i][j];
                    }
                }
            }    

        
        return sum;
    }
}
