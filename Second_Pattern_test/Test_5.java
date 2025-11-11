package Beginner_Interview_Question.Second_Pattern_test;

public class Test_5 {
    public static void main(String[] args)
    {
        int l = 7;
        int m = 2*l-3;
        for(int i=1 ; i<= 2*l-1 ; i++)
        {

            //space
            int temp = 0;
            if(i <= l)
            {
                temp = 2*(l-i)+1;
            }
            else {
                temp = 2*(i-l)+1;
            }
            for(int j = 1 ; j <= temp ; j++)
            {
                System.out.print(" ");
            }

            //star

            for(int k= 1 ; k <= 2*l - temp ; k++)
            {
                if(i<=l)
                {
                    if(i==1)
                    {
                        System.out.print("*" + " ");
                    }
                    else if(k==1 || k==2*i-1)
                    {
                        System.out.print("*" + " ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else
                {
                    if(i==2*l-1)
                    {
                        System.out.print("*" + " ");
                    }
                    else if(k==1 || k== m)
                    {
                        System.out.print("*" + " ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
            }

            if(i > l)
            {
                m = m-2;
            }
            System.out.println("\n");

        }
    }
}
