package Beginner_Interview_Question.Second_Pattern_test.Set_2;

public class Test_3 {
//    public static void main(String[] args)
//    {
//        int l = 7;
//
//        for(int i=1 ; i<=l ; i++)
//        {
//            char c = 'Z';
//            for(int k=1 ; k<=i ; k++)
//            {
//                System.out.print(c + " ");
//                c--;
//            }
//
//            System.out.println("\n");
//        }
//    }

//    //-----------------------------------------
//
//        public static void main(String[] args)
//    {
//        int l = 7;
//        char c = 'A';
//
//        for(int i=1 ; i<=l ; i++)
//        {
//
//            for(int j=1 ; j<=l-i+1 ; j++ )
//            {
//                System.out.print(" ");
//            }
//
//            char ch = c;
//            for(int k=1 ; k<=i ; k++)
//            {
//                System.out.print(ch + " ");
//                ch--;
//            }
//            c++;
//
//            System.out.println("\n");
//        }
//    }

    //-----------------------------------------
//
    public static void main(String[] args)
    {
        int l=7;
        int m =l-1;
        int n=2;
        for(int i=1 ; i<=2*l-1 ; i++)
        {
            //space
            int temp = 0;
            if(i<=l)
            {
                temp = i;
            }
            else
            {
                temp = m;
            }
            for(int j=1 ; j<= temp ; j++)
            {
                System.out.print(" ");
            }

            //shape
            int tem = 0;

            if(i<=l)
            {
                tem = l-i+1;
            }
            else
            {
                tem = n;
            }

            char c = 'A';
            for(int k=1 ; k<= tem ; k++)
            {
                System.out.print(c);
                c++;
            }

            System.out.println("\n");

            if(i>l)
            {
                m--;
                n++;
            }
        }
    }
}
