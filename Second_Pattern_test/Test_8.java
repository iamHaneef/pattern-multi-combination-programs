package Beginner_Interview_Question.Second_Pattern_test;

public class Test_8 {
    public static void main(String[] args)
    {

        int l = 7;
        int m=l-1;
        int n=2;
        int num=l-1;
        for(int i=1 ; i<=2*l-1 ; i++)
        {
            //space
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

            //shape

            int tem = 0;
            if(i<=l)
            {
                tem = l-i+1;
            }
            else
            {
                tem = n;
            }

            int num_1 = i;
            int num_2 = num;

            for(int k=1 ; k<=tem ; k++)
            {
                if(i<=l)
                {
                    System.out.print(num_1);
                    num_1++;
                }
                else
                {
                    System.out.print(num_2);
                    num_2++;
                }
            }

            System.out.println("\n");

            if(i>l)
            {
                m--;
                n++;
                num--;
            }
        }
    }
}
