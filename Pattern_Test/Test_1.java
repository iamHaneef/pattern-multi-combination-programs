package Beginner_Interview_Question.Pattern_Test;

public class Test_1 {

    public static void main(String[] args)
    {
        int l = 7;
        for(int i=1; i<=l ; i++)
        {
            // no space
            int num = l;
            // shape

            for(int k=1 ; k<=i ; k++)
            {
                System.out.print(num + " ");
                num--;
            }
            System.out.println("\n");
        }
    }

}
