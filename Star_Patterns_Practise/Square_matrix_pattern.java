package Beginner_Interview_Question.Star_Patterns_Practise;

public class Square_matrix_pattern {
    public static void main(String[] args)
    {
        int l = 3; // l -> length
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
                System.out.print("*    ");
            }

            System.out.println("\n");


        }
    }
}
