package Beginner_Interview_Question.Star_Patterns_Practise;

public class LeftHalf_pyamid {
    public static void main(String[] args)
    {
        int l = 7; // l -> length
        // size
        for(int i=1 ; i<=l ; i++)
        {
            // space

            for(int j=0 ; j <= 2*(l-i)+1 ; j++ )
            {
                System.out.print(" ");
            }

            // star pattern

            for(int k=1 ; k< 2*i ; k++)
            {
                System.out.print("*");
            }

            System.out.println("\n");
        }
    }
}
