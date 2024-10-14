package Queue;

import java.util.ArrayList;

public class DemoQueue {
    
    public static void main(String[] args) {

    }
}

class MyHeap{

    ArrayList<Integer>arr =new ArrayList<Integer>();

    public  void add(int d ){
        arr.add(d);
        int index=arr.size()-1;
        int parentIndex=(index*2)+1;
        while(index>parentIndex){
            if(arr.get(index)< arr.get(parentIndex)){
                
            }
        }
    }

    public  void remove(){

    }

    public int peek(){
        return arr.get(0);
    }

}


