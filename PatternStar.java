public class PatternStar {
    public static void main(String[] args) {
        
        /**
         * $
         * $$
         * $$$
         * $$$$
         * $$$$$
         */

        //  int n=5;
        //  int star=1;
        //  for(int i=0;i<n;i++){
        //      for(int j=0;j<star;j++){
        //          System.out.print("*");
        //      }
        //      star++;
        //      System.out.println();
 
        //  }







         /**
          * _ _ _&
          *    &&
          *   &&&
          *  &&&&
          */
        // int n=5;
        // int star=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<star;j++){
        //         System.out.print("*");
        //     }
        //     star++;
        //     System.out.println();

        // }

        // int n=9;
        // int sp=n-1;
        // int st=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<sp;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<st;j++){
        //         System.out.print("*");
        //     }
        //     sp--;
        //     st++;
        //     System.out.println();

        // }

        // int n=5;
        // int sp=(n/2);
        // int st=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<sp;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<st;j++){
        //         System.out.print("*");
        //     }
            

        //     if(i<n/2){
        //         st=st+2;
        //         sp--;
        //     }else{
        //         st=st-2;
        //         sp++;
        //     }

        //     System.out.println();

        // }




        int n=7;
        int sp=(n/2);
        int spIn=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            // for(int j=0;j<st;j++){
            //     System.out.print("*");
            // }
            System.out.print("*");

            for(int j=0;j<spIn;j++){
                System.out.print(" ");
            }
            if(i!=0 && i != n-1){
                System.out.print("*");
            }


            if(i<n/2){
                spIn=spIn+2;
                sp--;
            }else{
                spIn=spIn-2;
                sp++;
            }

            System.out.println();

        }


        
    }
}
