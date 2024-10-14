public class RangeSum {
    
    public static void main(String[] args) {
        //arr  0    0   0   0   0   0   0   0   0   0   
        //idx  0    1   2   3   4   5   6   7   8   9 

        //arr  0    3   3   3   3    3   0   0   0   0 
        //arr  0    3   3   3   10   10  7  7   7   0 
        //arr  0    3   3   3   10   10  8  8   8   1 

        
        


        int n=10;

        int arr[]=new int[n];
        int operations[][]=new int [][]{

            {1,5,3},
            {4,8,7},
            {6,9,1},
            

        };
        int res[]=RangeSum(arr,operations);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    public static int [] RangeSum(int arr[] ,int operations[][]){


        int n=arr.length;

        for (int i = 0; i < operations.length; i++) {
            int st=operations[i][0];
            int end=operations[i][1];
            int val=operations[i][2];

            arr[st]=arr[st]+val;
            
            if(end+1 < n){
                arr[end+1]=arr[end+1]-val;
            }

        }

        int sum=0;
        for (int j = 0; j < arr.length; j++) {
            sum=sum+arr[j];
            arr[j]=sum;
        }

        return arr;
    }
}
