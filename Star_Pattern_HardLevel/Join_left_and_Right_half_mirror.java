package Beginner_Interview_Question.Star_Pattern_HardLevel;

public class Join_left_and_Right_half_mirror {
    public static void main(String[] args)
    {

        /*                         *
         * *                     * *
         * * *                 * * *
         * * * *             * * * *
         * * * * *         * * * * *
         * * * * * *     * * * * * *
         * * * * * * * * * * * * * *
         * * * * * *     * * * * * *
         * * * * *         * * * * *
         * * * *             * * * *
         * * *                 * * *
         * *                     * *
         *                         *     */


        // size

        int l = 7;
        int m = l-1;
        int n = l+1;


        for(int i=1 ; i<= l*2-1 ; i++)
        {

            // no space

            for(int k=1 ; k<= 2*l-1 ; k++)
            {
                if(i<=l)
                {
                    if(k<=i || k>=2*l-i)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else
                {
                    if(k<=m || k>=n)
                    {

                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }

            }
            if(i > l)
            {
                m--;
                n++;
            }

            System.out.println("\n");


        }
    }
}
