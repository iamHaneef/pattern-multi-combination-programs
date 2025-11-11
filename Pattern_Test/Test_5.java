package Beginner_Interview_Question.Pattern_Test;

public class Test_5 {
    public static void main(String[] args)
    {
        int l = 7;
        for(int i=1; i<=l ; i++)
        {
            // no space

            // shape

            for(int k=1 ; k<=i*2-1 ; k++)
            {
                if(k % 2==0)
                {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print(k + " ");
                }

            }
            System.out.println("\n");
        }
    }
}
