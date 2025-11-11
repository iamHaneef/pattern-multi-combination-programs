package Beginner_Interview_Question.Pattern_Test;

public class Test_8 {
    public static void main(String[] args)
    {
        int l = 7;
        int n = l-1; // for shape
        int m = 2;
        for(int i=1; i<=l*2-1 ; i++)
        {
            // no space

            int tem = 0;
            if(i<=l)
            {
                tem = i;
            }
            else{
                tem = n;
            }

            for(int j=1 ; j<=tem ; j++)
            {
                System.out.print(" ");
            }
            if(i > l)
            {
                n--;
            }


            // shape

            int temp = 0;
            if(i <= l)
            {
                temp = l-i+1;
            }
            else{
                temp = m;
            }



            for(int k=1 ; k<=temp ; k++)
            {
                System.out.print("*" + " ");


            }

            if(i > l)
            {
                m++;

            }
            System.out.println("\n");
        }
    }
}
