package Beginner_Interview_Question.Number_pattern_practise;
//Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
//        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

public class Level_1_number_patt {

    /* public static void main(String[] args)
    {

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6
        1 2 3 4 5 6 7

        int l = 7;
        for(int i=1 ; i<=l ; i++)
        {
            // no space

            // shape
            for(int k=1 ; k<=i ; k++)
            {
                // number condition
                System.out.print(k + " ");

            }
            System.out.println("\n");
        }

    }

--------------------------------------------------------------------------
    */
//    public static void main(String[] args)
//    {
//        /*
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
//        */
//        int l = 7;
//        for(int i=l ; i>=1 ; i--)  // i -> int i=0 ; i<l ; i++
//        {
//            // no space
//
//            // shape
//            for(int k = 1 ; k<=i ; k++) // k -> int k = 1 ; k<=l-i ; k++
//            {
//                // number condition
//                System.out.print(k + " ");
//
//            }
//            System.out.println("\n");
//        }
//    }

    //----------------------------------------------------
//    public static void main(String[] args)
//    {
//
////        1
////        2 2
////        3 3 3
////        4 4 4 4
////        5 5 5 5 5
////        6 6 6 6 6 6
////        7 7 7 7 7 7 7
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                System.out.print(i + " ");
//
//            }
//            System.out.println("\n");
//        }
//
//    }

    //----------------------------------------------------



//    public static void main(String[] args)
//    {
//
////        7 7 7 7 7 7 7
////        6 6 6 6 6 6
////        5 5 5 5 5
////        4 4 4 4
////        3 3 3
////        2 2
////        1
//
//        int l = 7;
//        for(int i=l ; i>=1 ; i--)
//        {
//            // no space
//
//            // shape
//            //no of count of k value
//            for(int k=1 ; k<= i ; k++) // k row values for how many time k value print
//            {
//                // number condition
//                System.out.print(i + " ");
//
//            }
//            System.out.println("\n");
//        }
//
//    }


    //----------------------------------------------------




//    public static void main(String[] args)
//    {
//
////        7
////        7 6
////        7 6 5
////        7 6 5 4
////        7 6 5 4 3
////        7 6 5 4 3 2
////        7 6 5 4 3 2 1
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num = l;
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                System.out.print(num + " ");
//                num--;
//
//            }
//            System.out.println("\n");
//        }
//
//    }

    //----------------------------------------------------


//
//    public static void main(String[] args)
//    {
//
////        7 6 5 4 3 2 1
////        7 6 5 4 3 2
////        7 6 5 4 3
////        7 6 5 4
////        7 6 5
////        7 6
////        7
//
//        int l = 7;
//        for(int i=l ; i>=1 ; i--)
//        {
//            // no space
//            int num = l;
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                System.out.print(num + " ");
//                num--;
//
//            }
//            System.out.println("\n");
//        }
//
//    }

    //----------------------------------------------------



//    public static void main(String[] args)
//    {
//
////        1
////        2 1
////        3 2 1
////        4 3 2 1
////        5 4 3 2 1
////        6 5 4 3 2 1
////        7 6 5 4 3 2 1
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num = i;
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                System.out.print(num + " ");
//                num--;
//
//            }
//            System.out.println("\n");
//        }
//
//    }

    //----------------------------------------------------



//    public static void main(String[] args)
//    {
//
////        7 6 5 4 3 2 1
////        6 5 4 3 2 1
////        5 4 3 2 1
////        4 3 2 1
////        3 2 1
////        2 1
////        1
//
//        int l = 7;
//        for(int i=l ; i>=1 ; i--)
//        {
//            // no space
//            int num=i;
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                System.out.print(num + " ");
//                num--;
//
//            }
//            System.out.println("\n");
//        }
//
//    }

    //----------------------------------------------------




//    public static void main(String[] args)
//    {
//
////        1
////        1 2 1
////        1 2 3 2 1
////        1 2 3 4 3 2 1
////        1 2 3 4 5 4 3 2 1
////        1 2 3 4 5 6 5 4 3 2 1
////        1 2 3 4 5 6 7 6 5 4 3 2 1
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num = 0;
//            // shape
//            for(int k=1 ; k<2*i ; k++)
//            {
//                // number condition
//                if(k <= i)
//                {
//                    num++;
//                    System.out.print(num +" ");
//
//                }
//                else{
//                    num -- ;
//                    System.out.print(num + " ");
//                }
//
//
//            }
//            System.out.println("\n");
//        }
//
//    }

    //----------------------------------------------------




    public static void main(String[] args)
    {

//                  1
//                1 2
//              1 2 3
//            1 2 3 4
//          1 2 3 4 5
//         1 2 3 4 5 6
//       1 2 3 4 5 6 7

        int l = 7;
        for(int i=1 ; i<=l ; i++)
        {
            //  space
            for(int j=1;j<= l-i ; j++)
            {
                System.out.print(" ");
            }
            int num = 1;
            // shape
            for(int k=1 ; k<= i ; k++)
            {
                // number condition
                System.out.print(num );
                num++;

            }
            System.out.println("\n");
        }

    }





















}
