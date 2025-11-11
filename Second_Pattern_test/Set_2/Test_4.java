package Beginner_Interview_Question.Second_Pattern_test.Set_2;

public class Test_4 {
//    public static void main(String[] args)
//    {
//        int l = 7;
//
//        for(int i = 1  ;i<=l ; i++)
//        {
//            int num = 0;
//            //shape
//            for(int k = 1 ; k<= 2*i-1 ; k++)
//            {
//                if(k<=i)
//                {
//                    num++;
//                    System.out.print(num);
//                }
//                else
//                {
//                    num--;
//                    System.out.print(num);
//                }
//            }
//            System.out.println("\n");
//        }
//    }
//    //---------------------------------------------
//public static void main(String[] args)
//{
//    int l = 5;
//
//    for(int i = 1  ;i<=l ; i++)
//    {
//
//        int num = i;
//        System.out.print(num + " ");
//
//        int start = l-1;
//
//
//        for (int k=1 ; k<i ; k++)
//        {
//            num = num + start;
//            System.out.print(num + " " );
//            start--;
//        }
//
//        System.out.println("\n");
//    }
//}
////---------------------------------------------
//public static void main(String[] args)
//{
//    int l = 5;
//    int num = 1;
//
//    for(int i = 1  ;i<=l ; i++)
//    {
//
//        int no = i+num-1;
//
//        for (int k=1 ; k<=i ; k++)
//        {
//
//            if(i%2==0)
//            {
//                System.out.print(no + " ");
//                no--;
//                num++;
//            }
//            else
//            {
//                System.out.print(num + " ");
//                num++;
//            }
//
//        }
//
//        System.out.println("\n");
//    }
//}
//---------------------------------------------
public static void main(String[] args)
{
    int l = 9;

    for(int i = 1  ;i<=l ; i++)
    {


        int first = i;
        int second = 1;

        for (int k=1 ; k<=l ; k++)
        {
            if(k <= l-i+1)
            {
                System.out.print(first + " ");
                first++;
            }
            else
            {
                System.out.print(second + " ");
                second++;
            }
        }

        System.out.println("\n");
    }
}
}
