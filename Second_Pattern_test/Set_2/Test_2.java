package Beginner_Interview_Question.Second_Pattern_test.Set_2;

public class Test_2 {
    public static void main(String[] args)
    {
        int l=7;
        int m = 2;
        int n=l-1;
        for(int i=1 ; i<=2*l-1 ; i++)
        {
            //space
            int temp = 0;
            if(i<=l)
            {
                temp = l-i+1;
            }
            else
            {
                temp = m;
            }
            for(int j=1 ; j<= temp ; j++)
            {
                System.out.print(" ");
            }

            //shape
            int tem = 0;

            if(i<=l)
            {
                tem = i;
            }
            else
            {
                tem = n;
            }
            for(int k=1 ; k<= tem ; k++)
            {
                System.out.print("*");
            }

            System.out.println("\n");

            if(i>l)
            {
                m++;
                n--;
            }
        }
    }
}
