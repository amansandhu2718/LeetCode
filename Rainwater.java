public class Rainwater {
    public static void main(String[] args) {
        int arr[]=new int []{4,2,0,3,2,5};

        System.out.println("\n"+trap(arr));
            // 0
            // 5,2
            // 0,5
    }

    public static int trap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
    
        int n = arr.length;
        
        // Initialize leftMaxArr and rightMaxArr
        int[] leftMaxArr = new int[n];
        int[] rightMaxArr = new int[n];
        
        leftMaxArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMaxArr[i] = Math.max(leftMaxArr[i - 1], arr[i]);
        }
        
        rightMaxArr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxArr[i] = Math.max(rightMaxArr[i + 1], arr[i]);
        }
        
        // Calculate the trapped water
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Math.min(leftMaxArr[i], rightMaxArr[i]) - arr[i];
        }
        
        return count;
    }
    
}
