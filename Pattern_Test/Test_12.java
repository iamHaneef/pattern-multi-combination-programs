package Beginner_Interview_Question.Pattern_Test;

public class Test_12 {
    public static void main(String[] args)
    {
        int l = 7;
        char start ='Z';
        for(int i=1; i<=l ; i++)
        {
            // no space

            for(int j=1; j<=l-i ;j++)
            {
                System.out.print(" ");
            }

            char c = start;
            // shape

            for(int k=1 ; k<=i ; k++)
            {
                System.out.print(c + " ");
                c++;
            }
            start--;
            System.out.println("\n");
        }
    }
}
