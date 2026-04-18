
public class RightHalfPyramid {
    public static void main(String[] args)
    {
        int l = 7; // l -> length
        // size
        for(int i=1 ; i<=l ; i++)
        {
            // no need space


            // star pattern

            for(int k=1 ; k< 2*i ; k++)
            {
                System.out.print("* ");
            }

            System.out.println("\n");
        }
    }
}
