package Beginner_Interview_Question.Second_Pattern_test.Set_2;

public class Test_1 {
//    public static void main(String[] args)
//    {
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            for(int k=1 ; k<=i ; k++)
//            {
//                System.out.print(k + " ");
//            }
//
//            System.out.println("\n");
//        }
//    }


    //-------------------------------------

//    public static void main(String[] args)
//    {
//        int l =7;
//        int num = l ;
//        for(int i=1 ; i<=l ; i++)
//        {
//            for(int k = 1 ; k<=l-i+1  ; k++)
//            {
//                System.out.print(num);
//            }
//            num--;
//            System.out.println("\n");
//        }
//    }

    //-------------------------------------
//    public static void main(String[] args)
//    {
//        int l = 7;
//        for(int i=1 ; i<=l ; i++)
//        {
//            for(int  j=1 ; j<=l-i+1 ; j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1 ; k<=i ; k++)
//            {
//                System.out.print(k + " ");
//            }
//
//            System.out.println("\n");
//        }
//    }
    //-------------------------------------
//    public static void main(String[] args) {
//        int l = 7;
//        for (int i = 1; i <= l; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            int num = i;
//            for (int k = 1; k <= l-i+1; k++) {
//                System.out.print(num + " ");
//                num++;
//            }
//
//            System.out.println("\n");
//        }
//    }

//    //-------------------------------------
//    public static void main(String[] args) {
//        int l = 7;
//        for (int i = 1; i <= l; i++) {
//            int odd = 1;
//            int even = 0;
//            for (int k = 1; k <= i; k++) {
//                if(k%2 ==0)
//                {
//                    System.out.print(even + " ");
//                }
//                else
//                {
//                    System.out.print(odd + " ");
//                }
//
//            }
//
//            System.out.println("\n");
//        }
//    }

//    //-------------------------------------
//    public static void main(String[] args) {
//        int l = 7;
//        char  c = 'A';
//        for (int i = 1; i <= l; i++) {
//
//            int num = 1;
//            char ch = c;
//            for (int k = 1; k <= l; k++) {
//
//                if(k<=i)
//                {
//                    System.out.print(num);
//                    num++;
//                }
//                else
//                {
//                    System.out.print(c);
//
//                }
//
//            }
//            c++;
//
//            System.out.println("\n");
//        }
//    }

    //-------------------------------------
    public static void main(String[] args) {
        int l = 7;
        char  c = 'A';
        for (int i = 1; i <= l; i++) {

            int num = 1;
            char ch = c;

            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(num);
                num++;
            }

            for (int k = 1; k <= l-i; k++) {
                System.out.print(ch);
            }
            c++;

            System.out.println("\n");
        }
    }
}

