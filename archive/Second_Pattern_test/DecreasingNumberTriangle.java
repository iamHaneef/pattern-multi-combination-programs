
public class DecreasingNumberTriangleSet2 {
    public static void main(String[] args)
    {
        int l = 7;

        for(int i=1 ; i<=l ; i++)
        {

            // pattern
            int num = l;

            for(int k=1 ; k<=i ; k++)
            {
                System.out.print(num + " ");
                num--;
            }
            System.out.println("\n");
        }
    }
}
