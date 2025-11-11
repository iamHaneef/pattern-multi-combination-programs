package Beginner_Interview_Question.Pattern_Test;

public class Test_9 {
    public static void main(String[] args)
    {
        int l = 7;
        for(int i=1; i<=l ; i++)
        {
            // no space

            // shape

            for(int k=1 ; k<=i ; k++)
            {
                if(k==1 || k==i)
                {
                    System.out.print("*" + " ");
                }
                else if (i==1 || i==l)
                {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println("\n");
        }
    }
}
