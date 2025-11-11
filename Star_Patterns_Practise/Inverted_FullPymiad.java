package Beginner_Interview_Question.Star_Patterns_Practise;

public class Inverted_FullPymiad {
    public static void main(String[] args)
    {
        int l = 7; // l -> length
        // size
        for(int i=1 ; i<=l ; i++)
        {
            // space

            for(int j=1 ; j <= 2*i ; j++ )
            {
                System.out.print(" ");
            }

            // star pattern

            for(int k=1 ; k<= 2*(l-i)+1 ; k++)
            {
                System.out.print("* ");
            }

            System.out.println("\n");
        }
    }
}
