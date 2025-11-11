package Beginner_Interview_Question.Pattern_Test;

public class Test_6 {
    public static void main(String[] args)
    {
        int l = 7;
        for(int i=1; i<=l ; i++)
        {
            // no space
            for(int j=1 ; j<= 2*(l-i)+1 ; j++)
            {
                System.out.print(" ");
            }



            // shape

            for(int k=1 ; k <=i ; k++)
            {
                System.out.print("*" + " ");

            }
            System.out.println("\n");
        }
    }
}
