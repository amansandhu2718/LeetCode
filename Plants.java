public class Plants {
    
    public static void main(String[] args) {
        
        int arr[]=new int []{0,0,1,0,0};

        System.out.println(canPlaceFlowers(arr,1));
    }

    public static boolean canPlaceFlowers(int[] arr, int n) {
        
        if(arr.length==1){
            if(arr[0]==0){
                arr[0]=1;
                n--;  
            }
        }else{
            for (int i = 0; i < arr.length-1; i++) {
            
                if(arr[i]==0){
                    if(i==arr.length-1){
                        if(arr[i-1]==0){
                            arr[i]=1;
                            n--;  
                        }
                    }
                    else if(i==0){
                        if(arr[i+1]==0){
                            arr[i]=1;
                            n--;     
                        }
                    }else{
                        if(arr[i-1]==1 || arr[i+1]==1){
    
                        }else{
                            arr[i]=1;
                            n--;
        
                         
                        }
                    }
                  
                }
    
            }    
    
            int lastIndex=arr.length-1;
            if(arr[lastIndex]==0){
                if(arr[lastIndex-1]==0){
                    arr[lastIndex]=1;
                    n--;  
                }
            }
        }

        
   for (int j = 0; j < arr.length; j++) {
            System.out.print(""+arr[j]+"\t");
    }
    System.out.println();
        
        if(n<=0){
            return true;
        }
        return false;
    }
}
