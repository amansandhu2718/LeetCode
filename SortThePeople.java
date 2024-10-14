
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortThePeople {
    public static void main(String[] args) {
        int arr[]=new int[]{155,185,150};
        String str[]=new String[]{"Alice","Bob","Bob"};
        str=sortPeople(str,arr);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        SortedMap<Integer,Integer> myMap = new TreeMap<>();

        for(int i=0; i <heights.length; i++){
            myMap.put(heights[i], i);
        }
        
        String arr[]= new String[names.length];
        int i=1;
        for(Map.Entry<Integer,Integer> entries : myMap.entrySet()){
            arr[arr.length-i] = names[entries.getValue()];
            i++;
        }
        return arr;
    }
}
