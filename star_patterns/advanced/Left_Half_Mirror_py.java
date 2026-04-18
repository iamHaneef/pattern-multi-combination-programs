package Beginner_Interview_Question.Star_Pattern_HardLevel;

public class Left_Half_Mirror_py {

    public static void main(String[] args)
    {
        /*
            *
          * *
        * * *
      * * * *
    * * * * *
  * * * * * *
* * * * * * *
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *
         */

        int l = 7;

        // total size = 13 , so

        for(int i=0; i<= 2*l-1 ; i++) // 13 -> ( 0 - 12 )  index 6 is the mid for diamond
        {

            // space
            int temp = 0;
            if(i < l)  // lessthan length
            {
                temp = 2*(l-i)-1; // stop at 1
            }
            else{
                temp = 2*(i-l+1) + 1; // again start at 3 skip 1 agin to form diamond

            }

            for(int j=0 ; j < temp ; j++)
            {
                System.out.print(" ");
            }

            // star pattern for diamond
            // just cut the space for star

            for(int k=0 ; k< 2*l - temp  ; k++)
            {
                System.out.print("*");
            }

            System.out.println("\n");
        }
    }
}
