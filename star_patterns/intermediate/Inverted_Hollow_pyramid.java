package Beginner_Interview_Question.Star_Patterns_Practise;

public class Inverted_Hollow_pyramid {
    public static void main(String[] args)
    {
        int l = 7; // l -> length
        // size
        for(int i=0 ; i<l ; i++)
        {
            // space

            for(int j=0 ; j < 2*i+1 ; j++ )
            {
                System.out.print(" ");
            }

            // condition for star pattern

            for(int k=0 ; k< 2*(l-i)-1 ; k++)
            {
                if(k==0 || k== 2*(l-i)-2)
                {
                    System.out.print("* ");
                }
                else if(i==0)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // give extra space for better shape perfect
                }


            }

            System.out.println("\n");


        }
    }
}
