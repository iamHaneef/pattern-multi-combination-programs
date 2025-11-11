package Beginner_Interview_Question.Second_Pattern_test;

public class Test_3 {
    public static void main(String[] args)
    {
        int l =7;
        int down = l-1; // down for space
        int down_2 = 2; // down for star

        for(int i=1; i<= 2*l-1 ; i++)
        {

            //space
            int temp = 0;
            if(i<=l)
            {
                temp =i;
            }
            else
            {
                temp = down;
            }

            for(int j=1 ; j<= temp ; j++)
            {
                System.out.print(" ");
            }

            //star

            int tem = 0;
            if(i <= l)
            {
                tem = l-i+1;
            }
            else
            {
                tem = down_2;
            }

            for(int k = 1 ; k<= tem ; k++)
            {
                System.out.print("* ");
            }

            if(i > l)
            {
                down --;
                down_2++;
            }
            System.out.println("\n");
        }
    }
}
