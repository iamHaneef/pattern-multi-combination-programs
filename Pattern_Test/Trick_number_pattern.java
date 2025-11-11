package Beginner_Interview_Question.Pattern_Test;

public class Trick_number_pattern {
//    public static void main(String[] args)
//    {
//        int l = 5;
//        int num=1;
//        for(int i=1; i<=l ; i++)
//        {
//            // no space
//
//            // shape
//            int temp = num + i - 1;
//
//            for(int k=1 ; k<=i ; k++)
//            {
//                if(i % 2 ==0)
//                {
//                    //condition
//                    System.out.print(temp + " ");
//                    temp--;
//                    num++;
//                }
//                else
//                {
//                    System.out.print(num + " ");
//                    num++;
//                }
//
//
//            }
//            System.out.println("\n");
//        }
//    }

    //-----------------------------------------

    public static void main(String[] args)
    {
        int l = 5;


        for(int i=1; i<=l ; i++)
        {
            // no space

            // shape
            System.out.print(i + " ");

            int start = l-1; // start at 4 for all loops
            int num = i;

            for(int k=1 ; k<i ; k++)
            {
               num = num + start;
               System.out.print(num + " ");
               start--;
            }
            System.out.println("\n");
        }
    }

}
