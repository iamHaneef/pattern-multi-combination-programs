package Beginner_Interview_Question.Pattern_Test;

public class Test_14 {
    public static void main(String[] args)
    {
        int l = 9;
        int same = l; // for i<=l same pattern
        int start = l+1; // for i<=l

        int n=l-2; // for i>l
        int m=l+2; // for i>l
        int fixed = 3; // for i>l
        int same2 = 2; // for i>l same pattern


        for(int i=1; i<=l*2-1 ; i++)
        {
            // no space

            // shape
            //i<=l
            int num = 9; // all start at 9
            int num2= start; // for right side numbers

            //i>l
            int num3 = fixed;

            for(int k=1 ; k<=l*2-1 ; k++)
            {
                if(i <= l)
                {
                    if(k <= i-1 )
                    {
                        System.out.print(num + " ");
                        num--;
                    }
                    else if (k > l*2-i) {
                        System.out.print(num2 + " ");
                        num2++;
                    }
                    else{
                        System.out.print(same + " ");
                    }

                }
                else{
                    if(k<=n)
                    {
                        System.out.print(num + " ");
                        num--;
                    }
                    else if (k>=m)
                    {
                        System.out.print(num3 + " ");
                        num3++;
                    }
                    else{
                        System.out.print(same2 + " ");
                    }
                }

            }
            if(i <= l)
            {
                start--; // 10 , 9 , 8 ,7....
                same--;
            }
            else {
                fixed++; // 3,4,5,6,7....
                n--;
                m++;
                same2++;
            }
            System.out.println("\n");
        }
    }

}
