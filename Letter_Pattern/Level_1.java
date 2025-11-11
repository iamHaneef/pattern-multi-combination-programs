package Beginner_Interview_Question.Letter_Pattern;

public class Level_1 {

    public static void main(String[] args)
    {
//        A
//        A B
//        A B C
//        A B C D
//        A B C D E
//        A B C D E F
//        A B C D E F G

        //size
        int l = 7;
        char start = 'A';
        for(int i=1 ; i<=l ; i++)
        {

            // no space

            for(int j=1 ; j<= l-i ; j++)
            {
                System.out.print(" ");
            }

            char c = start ; // temp A , B , C ,D , E, F.....
            //shape

            for(int k=1 ; k<= i  ; k++)
            {
                System.out.print(c +" ");
                c--;

            }
            start++;
            System.out.println("\n");

        }

    }

//    //----------------------------------------------------
//
//    public static void main(String[] args)
//    {
////        A
////        A B
////        A B C
////        A B C D
////        A B C D E
////        A B C D E F
////        A B C D E F G
//
//        //size
//        int l = 7;
//        int n = l-1; // for space
//        int m = 2; // for shape
//        char start = 'Z';
//        for(int i=1 ; i<=l*2-1 ; i++)
//        {
//
//            //space
//            int temp = 0;
//            if(i <= l)
//            {
//                temp = i;
//            }
//            else{
//                temp = n;
//            }
//
//            for(int j=1 ; j< temp ; j++)
//            {
//                System.out.print(" ");
//            }
//            if(i > l)
//            {
//                n--;
//            }
//
//
//            //shape
//            char c = 'A';
//            int tem = 0;
//
//            if(i <= l)
//            {
//                tem = l-i+1;
//            }
//            else{
//                tem = m;
//            }
//            for(int k=1 ; k<= tem ; k++)
//            {
//                System.out.print(c);
//                c++;
//            }
//
//            if(i > l)
//            {
//                m++;
//            }
//            System.out.println("\n");
//
//        }
//
//    }


    //    //----------------------------------------------------

//    public static void main(String[] args)
//    {
////        A
////        A B
////        A B C
////        A B C D
////        A B C D E
////        A B C D E F
////        A B C D E F G
//
//        //size
//        int l = 7;
//
//        int m = l-1; // for shape
//
//        for(int i=1 ; i<=l*2-1 ; i++)
//        {
//
//            //no space
//
//
//
//
//            //shape
//            char c = 'A';
//            int temp = 0;
//
//            if(i <= l)
//            {
//                temp = i;
//            }
//            else{
//                temp = m;
//            }
//            for(int k=1 ; k<= temp ; k++)
//            {
//                System.out.print(c +" ");
//                c++;
//
//            }
//
//            if(i > l)
//            {
//                m--;
//            }
//            System.out.println("\n");
//
//        }
//
//    }

    //----------------------------------------------------//    //----------------------------------------------------

//        public static void main(String[] args)
//        {
//    //        A
//    //        A B
//    //        A B C
//    //        A B C D
//    //        A B C D E
//    //        A B C D E F
//    //        A B C D E F G
//
//            //size
//            int l = 7;
//            int n = 3; // for space
//            int m = l-1; // for shape
//
//            for(int i=1 ; i<=l*2-1 ; i++)
//            {
//
//                //space
//                int temp = 0;
//                if(i <= l)
//                {
//                    temp = 2*(l-i)+1;
//                }
//                else{
//                    temp = n;
//                }
//
//                for(int j=1 ; j< temp ; j++)
//                {
//                    System.out.print(" ");
//                }
//                if(i > l)
//                {
//                    n=n+2;
//                }
//
//
//                //shape
//                char c = 'A';
//                int tem = 0;
//
//                if(i <= l)
//                {
//                    tem = i;
//                }
//                else{
//                    tem = m;
//                }
//                for(int k=1 ; k<= tem ; k++)
//                {
//                    System.out.print(c +" ");
//                    c++;
//
//                }
//
//                if(i > l)
//                {
//                    m--;
//                }
//                System.out.println("\n");
//
//            }
//
//        }
    //
    //    //----------------------------------------------------//    //----------------------------------------------------

//            public static void main(String[] args)
//        {
//    //        A
//    //        A B
//    //        A B C
//    //        A B C D
//    //        A B C D E
//    //        A B C D E F
//    //        A B C D E F G
//
//            //size
//            int l = 7;
//            int n = 2; // for space
//            int m = l-1; // for shape
//
//            for(int i=1 ; i<=l*2-1 ; i++)
//            {
//
//                //space
//                int temp = 0;
//                if(i <= l)
//                {
//                    temp = l-i+1;
//                }
//                else{
//                    temp = n;
//                }
//
//                for(int j=1 ; j< temp ; j++)
//                {
//                    System.out.print(" ");
//                }
//                if(i > l)
//                {
//                    n++;
//                }
//
//
//                //shape
//                char c = 'A';
//                int tem = 0;
//
//                if(i <= l)
//                {
//                    tem = i;
//                }
//                else{
//                    tem = m;
//                }
//                for(int k=1 ; k<= tem ; k++)
//                {
//                    System.out.print(c +" ");
//                    c++;
//
//                }
//
//                if(i > l)
//                {
//                    m--;
//                }
//                System.out.println("\n");
//
//            }
//
//        }

    //    //----------------------------------------------------//    //----------------------------------------------------
    ////
    ////    public static void main(String[] args)
    ////    {
    //////        A
    //////        A B
    //////        A B C
    //////        A B C D
    //////        A B C D E
    //////        A B C D E F
    //////        A B C D E F G
    ////
    ////        //size
    ////        int l = 7;
    ////        int n = l-1; // for space
    ////        int m = 2; // for shape
    ////        char start = 'Z';
    ////        for(int i=1 ; i<=l*2-1 ; i++)
    ////        {
    ////
    ////            //space
    ////            int temp = 0;
    ////            if(i <= l)
    ////            {
    ////                temp = i;
    ////            }
    ////            else{
    ////                temp = n;
    ////            }
    ////
    ////            for(int j=1 ; j< temp ; j++)
    ////            {
    ////                System.out.print(" ");
    ////            }
    ////            if(i > l)
    ////            {
    ////                n--;
    ////            }
    ////
    ////
    ////            //shape
    ////            char c = 'A';
    ////            int tem = 0;
    ////
    ////            if(i <= l)
    ////            {
    ////                tem = l-i+1;
    ////            }
    ////            else{
    ////                tem = m;
    ////            }
    ////            for(int k=1 ; k<= tem ; k++)
    ////            {
    ////                System.out.print(c);
    ////                c++;
    ////            }
    ////
    ////            if(i > l)
    ////            {
    ////                m++;
    ////            }
    ////            System.out.println("\n");
    ////
    ////        }
    ////
    ////    }
    //
    //    //----------------------------------------------------//    //----------------------------------------------------
    ////
    ////    public static void main(String[] args)
    ////    {
    //////        A
    //////        A B
    //////        A B C
    //////        A B C D
    //////        A B C D E
    //////        A B C D E F
    //////        A B C D E F G
    ////
    ////        //size
    ////        int l = 7;
    ////        int n = l-1; // for space
    ////        int m = 2; // for shape
    ////        char start = 'Z';
    ////        for(int i=1 ; i<=l*2-1 ; i++)
    ////        {
    ////
    ////            //space
    ////            int temp = 0;
    ////            if(i <= l)
    ////            {
    ////                temp = i;
    ////            }
    ////            else{
    ////                temp = n;
    ////            }
    ////
    ////            for(int j=1 ; j< temp ; j++)
    ////            {
    ////                System.out.print(" ");
    ////            }
    ////            if(i > l)
    ////            {
    ////                n--;
    ////            }
    ////
    ////
    ////            //shape
    ////            char c = 'A';
    ////            int tem = 0;
    ////
    ////            if(i <= l)
    ////            {
    ////                tem = l-i+1;
    ////            }
    ////            else{
    ////                tem = m;
    ////            }
    ////            for(int k=1 ; k<= tem ; k++)
    ////            {
    ////                System.out.print(c);
    ////                c++;
    ////            }
    ////
    ////            if(i > l)
    ////            {
    ////                m++;
    ////            }
    ////            System.out.println("\n");
    ////
    ////        }
    ////
    ////    }
    //
    //    //----------------------------------------------------



}
