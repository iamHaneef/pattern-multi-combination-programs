package Beginner_Interview_Question.Second_Pattern_test;

public class Test_10 {
    public static void main(String[] args)
    {
        int l = 7;
        for(int i=1 ; i<=l ; i++)
        {
            //shape



            for(int k = 1 ; k<=2*i-1 ; k++)
            {
                if(k%2 == 0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(k + " ");
                }
            }
            System.out.println("\n");
        }
    }
}
