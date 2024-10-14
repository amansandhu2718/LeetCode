import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DestinationCity {
    public static void main(String[] args) {
        String [][]arrOld=new String[][]{{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};

        List<List<String>> arr=new ArrayList<List<String>>();

        ArrayList<String> temp;
        for (int i = 0; i < 3; i++) {

            temp=new ArrayList<>();
            for (int j = 0; j < arrOld[i].length; j++) {
                temp.add(arrOld[i][j]);
            }
            arr.add(temp);

        }
        System.out.println(""+destCity(arr));
        
    }

    

    public static String destCity(List<List<String>> paths) {
        
        HashMap<String,String> mymap =new HashMap<String,String>();


        for (int i = 0; i < paths.size(); i++) {
            mymap.put(paths.get(i).get(0),paths.get(i).get(1));
        }

        String res ="";
        for (int i = 0; i < paths.size(); i++) {
            if(!mymap.containsKey(paths.get(i).get(1))){
                res=paths.get(i).get(1);
                break;
            }
        }        
        return res;
    }
    
}
