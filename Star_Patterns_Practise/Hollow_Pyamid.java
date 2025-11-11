package Beginner_Interview_Question.Star_Patterns_Practise;

public class Hollow_Pyamid {

    public static void main(String[] args)
    {
        int l = 7; // l -> length
        // size
        for(int i=0 ; i<l ; i++)
        {
            // space

            for(int j=0 ; j < 2*(l-i)-1 ; j++ )
            {
                System.out.print(" ");
            }

            // condition for star pattern

            for(int k=0 ; k< 2*i+1 ; k++)
            {
                if(k == 0 || k == i*2 )
                {
                    System.out.print("* ");
                }
                else if( i == l-1 ) // length = 6 last line
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // give extra space for perfect diagram
                }
            }

            System.out.println("\n");


        }
    }

}
