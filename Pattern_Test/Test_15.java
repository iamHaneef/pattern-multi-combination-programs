package Beginner_Interview_Question.Pattern_Test;

public class Test_15 {
    public static void main(String[] args)
    {
        int l = 7;
        int n = l-1;
        int m = l+2;

        for(int i=1; i<=l*2-1 ; i++)
        {
            // no space
            int num = l;
            // shape

            for(int k=1 ; k<=l*2 ; k++)
            {
                if(i<=l)
                {
                    if(k<=i)
                    {
                        System.out.print("* ");
                    }
                    else if (k >= l*2-i+1)
                    {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else
                {
                    if(k <= n)
                    {
                        System.out.print("* ");
                    }
                    else if (k >= m)
                    {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }

            if(i >= l)
            {
                n--;
                m++;
            }
            System.out.println("\n");
        }
    }

}
