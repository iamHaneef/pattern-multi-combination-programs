package Beginner_Interview_Question.Second_Pattern_test;

public class Test_7 {
    public static void main(String[] args)
    {
        int l =7;
        int m=l-1;
        for (int i=1 ; i<=2*l-1 ; i++)
        {

            //star
            int temp = 0;
            if(i<=l)
            {
                temp = i;
            }
            else
            {
                temp = m;
            }

            for(int k=1 ; k <= temp ; k++)
            {
                System.out.print(k + " ");
            }

            if(i>l)
            {
                m--;
            }
            System.out.println("\n");

        }
    }
}
