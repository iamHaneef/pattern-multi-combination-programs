package Beginner_Interview_Question.Pattern_Test;

public class Test_2 {
    public static void main(String[] args)
    {
        int l = 7;
        int n = l-1; // for shape
        for(int i=1; i<=l*2-1 ; i++)
        {
            // no space
            int num = 1;
            // shape

            int temp = 0;
            if(i <= l)
            {
                temp = i;
            }
            else{
                temp = n;
            }

            for(int k=1 ; k<=temp ; k++)
            {
                System.out.print(num + " ");
                num++;
            }

            if(i > l)
            {
                n--;
            }
            System.out.println("\n");
        }
    }
}
