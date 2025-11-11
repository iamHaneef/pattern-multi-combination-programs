package Beginner_Interview_Question.Second_Pattern_test;

public class Test_12 {
    public static void main(String[] args)
    {
        int l = 7;
        char c='Z';
        for(int i=1 ; i<=l  ; i++)
        {

            //space


            for(int j=1 ; j<=l-i+1 ; j++)
            {
                System.out.print(" ");
            }
            char ch = c;
            //shape
            for(int k=1 ; k<=i ; k++)
            {
                System.out.print(ch + " ");
                ch++;
            }

            c--;


            System.out.println("\n");
        }
    }
}
