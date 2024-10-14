public class PrintMatrix {
    public static void main(String[] args) {

        int Ques [][] = new int [][]{

            {1, 0, 0, 8, 0, 0, 0, 0, 9},
            {0, 0, 0, 3, 0, 5, 0, 8, 7},
            {3, 9, 0, 0, 0, 0, 6, 0, 0},
            {0, 0, 0, 0, 5, 7, 9, 0, 0},
            {5, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 4, 6, 0, 0, 0, 0},
            {0, 0, 4, 0, 0, 0, 0, 1, 5},
            {2, 8, 0, 5, 0, 1, 0, 0, 0},
            {9, 0, 0, 0, 0, 4, 0, 0, 3}
            
        };

       printMatrix(Ques,0,0);
       System.out.println();

    }

    public static void printMatrix(int board[][], int row , int col){
        if(row==board.length-1 && col==board[0].length-1){
            System.out.println(board[row][col]+" ");
            return;
        }        
        int nextRow=0;
        int nextCol=0;
        if(col==board[0].length-1){
            System.out.println(board[row][col]+" ");
            nextCol=0;
            nextRow=row+1;
        }else{
            System.out.print(board[row][col]+" ");
            nextCol=col+1;
            nextRow=row;
        }
        printMatrix(board,nextRow,nextCol);

    }

    
}