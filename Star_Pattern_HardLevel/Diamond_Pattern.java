package Beginner_Interview_Question.Star_Pattern_HardLevel;

public class Diamond_Pattern {

    public static void main(String[] args)
    {
        int l = 5;
        int dec = 2*l - 3;

        // total size = 13 , so
        for(int i=1; i<= 2*l ; i++) // 13 -> ( 0 - 12 )  index 6 is the mid for diamond
        {
            // space
            int temp = 0;
            if(i <= l)  // lessthan length
            {
                temp = 2*(l-i)+1; // stop at 1
            }
            else{
                temp = 2*(i-l) + 1; // again start at 3 skip 1 agin to form diamond

            }

            for(int j=1 ; j <= temp ; j++)
            {
                System.out.print(" ");
            }

            // star pattern for diamond
            int tem = 0;
            if(i<=l)
            {
                tem = 2*i -1;
            }
            else {
                tem = dec;

            }

            for(int k=1 ; k<= tem  ; k++)
            {
                System.out.print("* ");
            }

            if(i > l)
            {
                dec = dec - 2;
            }

            System.out.println("\n");
        }
    }

}
