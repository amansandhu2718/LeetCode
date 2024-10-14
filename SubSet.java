import java.util.ArrayList;

public class SubSet {
    
    public static void main(String[] args) {
        

    int arr[]=new int []{5,1,6};
    int pow=(int)Math.pow(2,arr.length);
    int sum=0;
      
      for (int i = 0; i < pow; i++) {
        int index=i;
        
        ArrayList<Integer> a= new ArrayList<Integer>();
        
        for (int j = 0; j < arr.length; j++) {
            int rem=index%2;
            index=index/2;
            if(rem==0){
            }else{
                a.add(arr[j]);
            }
        }



        if(a.size()<=1){

            if(a.size()==1){
                sum=sum+a.get(0);
            }
            
        }else{
            int xor=a.get(0);
            for (int j = 1; j < a.size(); j++) {
                xor=xor^a.get(j);
            }

            sum=sum+xor;
        }
      }

    }
}
