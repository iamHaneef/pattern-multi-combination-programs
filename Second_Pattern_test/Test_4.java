package Beginner_Interview_Question.Second_Pattern_test;

public class Test_4 {
    public static void main(String[] args)
    {

        int l = 7 ;

        for(int i=1 ; i<= l ; i++)
        {
            // star

            for(int k=1 ; k<= 2*i-1 ; k++)
            {
                if(i==1 || i==l)
                {
                    System.out.print("*" + " ");
                }
                else if (k==1 || k==2*i-1)
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("\n");
        }

    }
}
