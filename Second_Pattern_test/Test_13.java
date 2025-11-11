package Beginner_Interview_Question.Second_Pattern_test;

public class Test_13 {
    public static void main(String[] args)
    {
        int l = 7;
        int m = l-1;
        int n = 2;
        for(int i=1 ; i<= 2*l-1 ; i++)
        {

            //space
            int temp = 0;
            if(i <= l)
            {
                temp = l-i+1;
            }
            else {
                temp = n;
            }
            for(int j = 1 ; j <= temp ; j++)
            {
                System.out.print(" ");
            }

            //star
            int tem = 0;
            if(i<=l)
            {
                tem = i;
            }
            else
            {
                tem = m;
            }

            char c = 'A';
            for(int k= 1 ; k <= tem ; k++)
            {
                System.out.print(c + " ");
                c++;
            }

            if(i>l)
            {
                m--;
                n++;
            }

            System.out.println("\n");

        }
    }
}
