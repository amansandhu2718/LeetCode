public class TimeToVisitAllPoints {
    public static void main(String[] args) {
        int arr[][]= new int [][]{{3,2},{-2,2}};

        int a=minTimeToVisitAllPoints(arr);
        System.out.println(a);

    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int count=0;
        for (int i = 1; i < points.length; i++) {
            count=count+(GetTime(points[i-1], points[i]));
        }
        
        return count;
    }


    public static int GetTime(int p1[], int p2[]){

        // System.err.println("p1 : x"+p1[0]+" y:"+ p1[1]);
        // System.err.println("p2 : x"+p2[0]+" y:"+ p2[1]);

        // int diffX=Math.abs(p1[0]-p2[0]);
        // int diffY=Math.abs(p1[1]-p2[1]);

        // System.err.println("diffX :"+diffX);
        // System.err.println("diffY :"+diffY);

        int xDiff = Math.abs(p1[0] - p2[0]);
        int yDiff = Math.abs(p1[1] - p2[1]);
        
        return Math.max(xDiff, yDiff);
    }
}
