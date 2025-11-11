package Beginner_Interview_Question.Number_pattern_practise;

public class Level_2_number_patt {

//    public static void main(String[] args) {
//
////            1 2 3 4 5 6 7
////              1 2 3 4 5 6
////                1 2 3 4 5
////                  1 2 3 4
////                    1 2 3
////                      1 2
////                        1
//
//        int l = 7;
//        for (int i = 1; i <= l; i++) {
//            // no space
//            for (int j = 1; j <= 2*i; j++) {
//                System.out.print(" ");
//            }
//            int num = 1;
//            // shape
//            for (int k = 1; k <= l - i + 1; k++) {
//                // number condition
//                System.out.print(num + " ");
//                num++;
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
//
////        1
////        10
////        101
////        1010
////        10101
////        101010
////        1010101
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int odd = 1;
//            int even = 0;
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                if(k % 2 ==0)
//                {
//                    System.out.print(even +" ");
//                }
//                else {
//                    System.out.print(odd +" ");
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
//
////        1010101
////        0101010
////        1010101
////        0101010
////        1010101
////        0101010
////        1010101
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int odd = 1;
//            int even = 0;
//
//            // shape
//            for(int k=1 ; k<= l ; k++)
//            {
//                // number condition
//                if(i % 2 ==0) // i is even
//                {
//                    if(k % 2 ==0)
//                    {
//                        System.out.print(odd + " ");
//                    }
//                    else {
//                        System.out.print(even+ " ");
//                    }
//                }
//                else{ // i odd
//                    if(k % 2 == 0)
//                    {
//                        System.out.print(even+ " ");
//                    }
//                    else{
//                        System.out.print(odd+ " ");
//                    }
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
//public static void main(String[] args)
//    {
//
////        1111111
////        1111122
////        1111333
////        1114444
////        1155555
////        1666666
////        7777777
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int one = 1;
//            for(int j=1 ; j <= l-i ; j++)
//            {
//                System.out.print(one);
//            }
//            // shape
//            int num = i;
//            for(int k=1 ; k<=i ; k++)
//            {
//                // number condition
//                System.out.print(num);
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
//
////        0000000
////        0100000
////        0020000
////        0003000
////        0000400
////        0000050
////        0000006
//
//        int l = 7;
//        for(int i=0 ; i<l ; i++)
//        {
//            // no space
//
//            int zero = 0;
//            // shape
//            for(int k=0 ; k<=l-1 ; k++)
//            {
//                // number condition
//                if(i == k)
//                {
//                    System.out.print(i + " ");
//                }

//                else{
//                    System.out.print(zero + " ");
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
//
////        1
////        2 3
////        4 5 6
////        7 8 9 10
//
//        int l = 4;
//        int num = 1;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//
//            // shape
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                System.out.print(num + " ");
//                num++;
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
//public static void main(String[] args)
//    {
//
////        1
////        3 2
////        4 5 6
////        10 9 8 7
////        11 12 13 14 15
//
//        int l = 5;
//        int num = 1;
//        int no = 0;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//
//            // shape
//            if(i % 2==0)
//            {
//                no = num+i-1;
//            }
//
//
//            for(int k=1 ; k<= i ; k++)
//            {
//                // number condition
//                if(i % 2 == 0)  // i -> 2 ,4 (index)
//                {
//                    System.out.print(no + " ");
//                    no--;
//                    num++;
//                }
//                else{           // i -> 1,3,5 (index)
//                    System.out.print(num + " ");
//                    num++;
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
////1
////*2*
////**3**
////***4***
////****5****
////*****6*****
////******7******
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//
//            // shape
//            for(int k=1 ; k< 2*i  ; k++)
//            {
//                // number condition
//                if(k==i)
//                {
//                    System.out.print(i);
//                }
//                else{
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
//
////1******
////12*****
////123****
////1234***
////12345**
////123456*
////1234567
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num = 1;
//            // shape
//            for(int k=1 ; k<= l ; k++)
//            {
//                // number condition
//                if(k>= l-i+1)
//                {
//                    System.out.print(num + " ");
//                    num++;
//                }
//                else{
//                    System.out.print("*" + " ");
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }

//--------------------------------------------------------------------------
// public static void main(String[] args)
//    {
////     1
////     1*2
////     1*2*3
////     1*2*3*4
////     1*2*3*4*5
////     1*2*3*4*5*6
////     1*2*3*4*5*6*7
//
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            // no space
//            int num = 1;
//            // shape
//            for(int k=1 ; k< 2*i  ; k++)
//            {
//                // number condition
//                if(k % 2 ==0)
//                {
//                    System.out.print("*" + " ");
//                }
//                else{
//                 System.out.print(num +" ");
//                 num++;
//                }
//
//            }
//            System.out.println("\n");
//        }
//
//    }
//
//    //-----------------------------------------------------


}




