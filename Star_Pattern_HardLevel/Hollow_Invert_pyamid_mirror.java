package Beginner_Interview_Question.Star_Pattern_HardLevel;

public class Hollow_Invert_pyamid_mirror {
    public static void main(String[] args)
    {
        int l = 7;
        int n = l-1;
        int m = 2;

        for(int i=0 ; i< l*2-1 ; i++)
        {

            // space
            int temp = 0;

            if(i < l)
            {
                temp = i+1;
            }
            else{
                temp = n;
            }

            for(int j = 0 ; j< temp ; j++)
            {
                System.out.print(" ");
            }
            if(i >= l)
            {
                n--;
            }

            // star
            int tem = 0;

            if(i<l)
            {
                tem = l-i;
            }
            else{
                tem = m;
            }
            for(int k=0 ; k<tem ; k++)
            {
                if(i<l)
                {
                    if(i==0 || k==0 || k==l-i-1)
                    {
                        System.out.print("* ");
                    }

                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    if( k==0 || k==m-1 || i==2*l-2 )
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }

            if(i >= l)
            {
                m++;
            }

            System.out.println("\n");



        }
    }
}
