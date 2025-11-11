package Beginner_Interview_Question.Second_Pattern_test.Set_2;

public class Test_5_final {
    public static void main(String[] args)
    {
        int l=9;

        int same = l;
        int same_2 = 2;

        int m=l-2;
        int n=l+2;

        int val = 3;

        for(int i=1 ; i<= 2*l-1 ; i++)
        {

            int first = l;
            int last = l-i+2;

            int val_2 = val;

            for(int k = 1 ; k<= 2*l-1 ; k++)
            {
                if(i<=l)
                {
                    if(k < i)
                    {
                        System.out.print(first + " ");
                        first--;
                    }
                    else if ( k > 2*l-i)
                    {
                        System.out.print(last + " ");
                        last++;
                    }
                    else
                    {
                        System.out.print(same + " ");
                    }
                }
                else
                {
                    if(k<=m)
                    {
                        System.out.print(first + " ");
                        first--;
                    }
                    else if(k>=n)
                    {
                        System.out.print(val_2 + " "); // start at 3
                        val_2++;
                    }
                    else {
                        System.out.print(same_2 + " ");
                    }
                }
            }

            if(i<=l)
            {
                same--;
            }
            else
            {
                m--;
                n++;
                val++;
                same_2++;
            }

            System.out.println("\n");
        }
    }
}
