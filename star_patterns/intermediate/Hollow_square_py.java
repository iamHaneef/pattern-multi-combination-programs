package Beginner_Interview_Question.Star_Patterns_Practise;

public class Hollow_square_py {
    public static void main(String[] args)
    {
        int l = 5; // l -> length
        // size
        for(int i=0 ; i<l ; i++)
        {
            // space

           /* for(int j=0 ; j < 2*i+1 ; j++ )
            {
                System.out.print(" ");
            }*/

            // condition for matrix star pattern

            for(int k=0 ; k< l ; k++)   // k < l for square
            {                           // k < l * 2 for rectangle
                if(i==0 || i == l-1)
                {
                    // top and bottom
                    System.out.print("*     ");
                }
                else if(k==0 || k== l-1)
                {
                    // left and right
                    System.out.print("*     ");

                }
                else{
                    System.out.print("      ");
                }
            }

            System.out.println("\n");


        }
    }
}
