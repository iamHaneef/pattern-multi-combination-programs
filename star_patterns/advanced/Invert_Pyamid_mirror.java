package Beginner_Interview_Question.Star_Pattern_HardLevel;

public class Invert_Pyamid_mirror {

    public static void main(String[] args)
    {
        int l = 7;
        int m = l-1;
        int n = 2;


        for(int i=1 ; i< l*2 ; i++)
        {

            // space
            int temp = 0;
            if(i<=l)
            {
                temp = i;
            }
            else
            {
                temp = m;
            }

            for(int j=1 ; j<=temp ; j++)
            {
                System.out.print(" ");
            }

            //star

            int tem = 0;

            if(i<=l)
            {
                tem = l-i+1;
            }
            else {
                tem = n;
            }

            for(int k=1 ; k<=tem ; k++)
            {

                if(i<=l)
                {
                    if(i==1 || i==l)
                    {
                        System.out.print("* ");
                    }
                    else if(k==1 || k== tem)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                }
                else {

                    if(k==1 || k == n)
                    {
                        System.out.print("* ");
                    }
                    else if(i == l+1 || i == 2*l-1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }

            }

            if(i > l)
            {
                m--;
                n++;
            }
            System.out.println("\n");



        }
    }

}
