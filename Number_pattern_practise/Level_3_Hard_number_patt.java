package Beginner_Interview_Question.Number_pattern_practise;

public class Level_3_Hard_number_patt {


// public static void main(String[] args)
//    {
////        1AAAAAA
////        12BBBBB
////        123CCCC
////        1234DDD
////        12345EE
////        123456F
////        1234567
//
//        int l = 7;
//        char c = 'A';
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num=1;
//            // shape
//            for(int k=1 ; k<=l  ; k++)
//            {
//                // number condition
//                if(k<=i)
//                {
//                    System.out.print(num +" ");
//                    num++;
//                }
//                else{
//                    System.out.print(c +" ");
//                }
//            }
//            c++;
//            System.out.println("\n");
//        }
//
//    }
//
//    //-----------------------------------------------------
// public static void main(String[] args)
//    {
////        1 2 3 4 5 6 7 8 9
////        2 3 4 5 6 7 8 9 1
////        3 4 5 6 7 8 9 1 2
////        4 5 6 7 8 9 1 2 3
////        5 6 7 8 9 1 2 3 4
////        6 7 8 9 1 2 3 4 5
////        7 8 9 1 2 3 4 5 6
////        8 9 1 2 3 4 5 6 7
////        9 1 2 3 4 5 6 7 8
//
//        int l = 9;
//
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num = i;
//
//            int start = 1;
//            // shape
//            for(int k=1 ; k<=l  ; k++)
//            {
//                // number condition
//                if(k<=l-i+1)
//                {
//                    System.out.print(num + " ");
//                    num++;
//
//                }
//                else{
//                    System.out.print(start+ " ");
//                    start++;
//                }
//
//
//            }
//            System.out.println("\n");
//        }
//
//    }
//
//    //-----------------------------------------------------
// public static void main(String[] args)
//    {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//
//        int l = 7;
//        int n = l-1;
//        for(int i=1 ; i<=2*l-1 ; i++)
//        {
//            // no space
//
//            int num = 1;
//            // shape
//            int temp =0;
//            if(i <= l)
//            {
//                temp = i;
//            }
//            else{
//                temp = n;
//            }
//
//            for(int k=1 ; k<= temp  ; k++)
//            {
//                // number condition
//
//                    System.out.print(num + " ");
//                    num++;
//
//
//
//            }
//            if(i > l)
//            {
//                n--;
//            }
//            System.out.println("\n");
//        }
//
//    }

//    //-----------------------------------------------------
//public static void main(String[] args)
//{
////    1 2 3 4 5 6 7
////    1 2 3 4 5 6
////    1 2 3 4 5
////    1 2 3 4
////    1 2 3
////    1 2
////    1
////    1 2
////    1 2 3
////    1 2 3 4
////    1 2 3 4 5
////    1 2 3 4 5 6
////    1 2 3 4 5 6 7
//
//    int l = 7;
//    int n = 2;
//    for(int i=1 ; i<=2*l-1 ; i++)
//    {
//        // no space
//
//        int num = 1;
//        // shape
//        int temp =0;
//        if(i <= l)
//        {
//            temp = l-i+1;
//        }
//        else{
//            temp = n;
//        }
//
//        for(int k=1 ; k<= temp  ; k++)
//        {
//            // number condition
//
//            System.out.print(num + " ");
//            num++;
//
//
//
//
//        }
//        if(i > l)
//        {
//            n++;
//        }
//        System.out.println("\n");
//    }
//
//}
//
//    //-----------------------------------------------------
//public static void main(String[] args)
//{
////    1234567
////     234567
////      34567
////       4567
////        567
////         67
////          7
////         67
////        567
////       4567
////      34567
////     234567
////    1234567
//
//
//    int l = 7;
//    int m = l-1; // space
//    int n = 2;   // shape
//    int down = l-1; // downwards for k number condition
//    for(int i=1 ; i<=2*l-1 ; i++)
//    {
//        //space
//
//        int tem = 0;
//
//        if(i <= l)
//        {
//            tem = i;
//        }
//        else{
//            tem = m;
//        }
//
//        for(int j = 1 ; j<tem ; j++)
//        {
//            System.out.print(" ");
//        }
//
//        if(i > l)
//        {
//            m--;
//        }
//
//
//        // shape
//
//
//
//        int temp =0;
//        if(i <= l)
//        {
//            temp = l-i+1;
//        }
//        else{
//            temp = n; // shape
//        }
//
//        int num = i; // print upwards
//        int down_2 = down;  // print downwards
//
//        for(int k=1 ; k<= temp  ; k++)
//        {
//            // number condition
//
//            if(i <= l)
//            {
//                System.out.print(num + " ");
//                num++;
//            }
//            else{
//                System.out.print(down_2 + " ");
//                down_2++;
//            }
//
//        }
//        if(i > l)
//        {
//            n++;
//            down--;
//        }
//        System.out.println("\n");
//    }
//
//}
//
//    //-----------------------------------------------------
//public static void main(String[] args)
//{
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
//
//
//    int l = 5;
//    for(int i=1 ; i<=l ; i++)
//    {
//        //no space
//
//        // shape
//        System.out.print(i +" ");
//
//        int num=i;
//        int start=l-1; // start at 4
//
//        for(int k=1 ; k< i  ; k++)
//        {
//            // number condition
//            num = num + start; // 2 + 4
//            System.out.print(num +" ");
//            start--;
//        }
//
//        System.out.println("\n");
//    }
//
//}




    //    //-----------------------------------------------------

public static void main(String[] args)
{
//{
//    9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9
//    9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9
//    9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9
//    9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9
//    9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9
//    9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9
//    9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9
//    9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9
//    9 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8 9
//    9 8 7 6 5 4 3 2 2 2 3 4 5 6 7 8 9
//    9 8 7 6 5 4 3 3 3 3 3 4 5 6 7 8 9
//    9 8 7 6 5 4 4 4 4 4 4 4 5 6 7 8 9
//    9 8 7 6 5 5 5 5 5 5 5 5 5 6 7 8 9
//    9 8 7 6 6 6 6 6 6 6 6 6 6 6 7 8 9
//    9 8 7 7 7 7 7 7 7 7 7 7 7 7 7 8 9
//    9 8 8 8 8 8 8 8 8 8 8 8 8 8 8 8 9
//    9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9 9

    int l = 9;

    int same = l; // same pattern inside

    int n=l-2; // start at 7
    int m=l+2; // start at 3
    int temp = 3;
    int same_2 = 2;

    for (int i = 1; i <= l*2-1 ; i++) {
        //no space
        // shape -> no problem , equal spac
        int first = l;
        int last = l-i+2;
        int temp_2 = temp; // start at 3 then 4,5,6,7,8...

        for (int k = 1; k <= l*2-1; k++)      {
            // number condition
         if(i <= l)
         {
             if(k < i)
             {
                 System.out.print(first + " ");
                 first--;
             }
             else if (k > l*2-i) {
                 System.out.print(last + " ");
                 last++;
             }
             else {
                 System.out.print(same+ " ");
             }
         }
         else {
             if(k <= n)
             {
                 System.out.print(first + " ");
                 first--;
             }
             else if (k >= m) {
                 System.out.print(temp_2 + " ");
                 temp_2++;
             }
             else {
                 System.out.print(same_2 + " ");
             }
         }
        }
        if(i <= l)
        {
            same--;
        }
        else{
            same_2++;
            temp++;
            n--;
            m++;
        }
        System.out.println("\n");
    }
}
}


