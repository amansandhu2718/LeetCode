public class CountTestingDevice {
 
    public static void main(String[] args) {
        
        int arr[] =new int[]{0,1,2};
        System.out.println(countTestedDevices(arr));
    }

    public static int countTestedDevices(int[] batteryPercentages) {

        int count=0;

        for (int i = 0; i < batteryPercentages.length; i++) {
            if(batteryPercentages[i]>0){
                count++;
            
                for (int j = i+1; j < batteryPercentages.length; j++) {
                    if(batteryPercentages[j]>0){
                        batteryPercentages[j]=batteryPercentages[j]-1;
                    }
                }
            }
        }

        return count;
    }
}
