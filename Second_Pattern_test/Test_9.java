package Beginner_Interview_Question.Second_Pattern_test;

public class Test_9 {
    public static void main(String[] args)
    {
        int l =7;
        int down = l-1; // down for space
        int down_2 = 2; // down for star

        int num = 6;

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

            int num_1 = i;
            int num_2 = num;

            for(int k = 1 ; k<= tem ; k++)
            {
                if(i<=l)
                {
                    System.out.print(num_1 + " ");
                    num_1++;
                }
                else
                {
                    System.out.print(num_2+ " ");
                    num_2++;

                }
            }

            if(i > l)
            {
                down --;
                down_2++;
                num--;
            }
            System.out.println("\n");
        }
    }
}
