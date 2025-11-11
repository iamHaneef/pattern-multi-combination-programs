package Beginner_Interview_Question.Star_Pattern_HardLevel;

public class Right_half_Mirror_py {
    public static void main(String[] args)
    {
        // size
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
*    */

        int l = 7;
        int n = l-2;
        for(int i=0 ; i< l*2-1 ; i++)
        {

            // no space
            int temp = 0;

            if(i < l)
            {
                temp = 2*i+1;
            }
            else{
                temp = n*2+1;
            }
            for(int k =0 ; k< temp ; k++)
            {
                System.out.print("* ");
            }
            if(i >= l)
            {
                n = n-1;
            }

            System.out.println("\n");


        }
    }
}
