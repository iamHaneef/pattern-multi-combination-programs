package Beginner_Interview_Question.Pattern_Test;

public class Test_11 {
    public static void main(String[] args)
    {
        int l = 7;
        for(int i=1; i<=l ; i++)
        {
            // no space

            // shape
            char c ='G';

            for(int k=1 ; k<=l-i+1 ; k++)
            {
                System.out.print(c + " ");
                c--;
            }
            System.out.println("\n");
        }
    }
}
