public class SunShade {
    public static void main(String[] args) {
        int [] arr=new int[]{4,2,5,1};

        int max=arr[0];
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                count++;
                max=arr[i];
            }
        }
        System.out.println(count);

    }
}
