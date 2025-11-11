package Beginner_Interview_Question.Second_Pattern_test;

public class Test_1 {

    public static void main(String[] args)
    {
        // row
        int l = 7;

        for(int i=1 ; i<=l ; i++)
        {
            //space
            for(int j=1; j <= 2*(l-i)+1 ; j++)
            {
                System.out.print(" ");
            }

            //star
            for(int k=1 ; k< 2*i ; k++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}
