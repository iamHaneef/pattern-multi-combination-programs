package Beginner_Interview_Question.Pattern_Test;

public class Test_10 {
    public static void main(String[] args)
    {
        int l = 7;
        int n=1;
        int m = l-1;
        for(int i=1; i<=l*2-1 ; i++)
        {
            //space
            int temp = 0;
            if(i<=l)
            {
                temp = l-i;
            }
            else{
                temp = n;
            }

            for(int j=1 ; j<= temp ; j++)
            {
                System.out.print(" ");
            }
            if(i > l)
            {
                n++;
            }

            // shape

            int tem = 0;
            if(i<=l)
            {
                tem = i;
            }
            else{
                tem = m;
            }
            for(int k=1 ; k<=tem ; k++)
            {
                if(i<=l)
                {
                    if(k==1 || k==i)
                    {
                        System.out.print("*" + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else{
                    if(k==1 || k==tem)
                    {
                        System.out.print("*" + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }


            }
            if(i > l)
            {
                m--;
            }
            System.out.println("\n");
        }
    }
}
