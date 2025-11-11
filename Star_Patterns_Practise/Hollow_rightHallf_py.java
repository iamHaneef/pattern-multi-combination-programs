package Beginner_Interview_Question.Star_Patterns_Practise;

public class Hollow_rightHallf_py {

    public static void main(String[] args)
    {
        int l = 7; // l -> length
        // size
        for(int i=0 ; i<l ; i++)
        {
            // no need space


            // star pattern

            for(int k=0 ; k< 2*i+1 ; k++)
            {
                if(k == 0 || k == i*2)
                {
                    System.out.print("* ");
                }
                else if(i== l -1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println("\n");
        }
    }

}
