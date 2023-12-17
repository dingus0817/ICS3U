public class CCC 
{
    public static void main(String[] args)
    {
        /*
         * Hale is a Turkish weaving artist. He is creating a square rug that consists
            of a grid of 25 squares arranged into 5 rows and 5 columns. On each
            square, Hale will place one of the following four symbols:
            @ ^ # ?
            
            He decides which symbol to place on each square using the row number
            and column number of the square and following the instructions in the
            decision tree given below.

            1. Does the row or column number equal 1 or 5?
            if yes -> @
            2. Does the row number equal the column number?
            if yes -> ^
            3. Is the row number larger than the column number? 
            if yes -> #
            else -> ?
         */
        
        String symbol1 = "@";
        String symbol2 = "^";
        String symbol3 = "#";
        String symbol4 = "?";

        System.out.print(" ");
        for (int i = 1; i <= 5; i++)
        {
            System.out.print(" " + i);
        }

        System.out.println();

        for (int r = 1; r <= 5; r++)
        {
            System.out.print(r);
            for (int c = 1; c <= 5; c++)
            {
                if (r == 1 || r == 5 || c == 1 || c == 5)
                {
                    System.out.print(" " + symbol1);
                }
                else if (r == c)
                {
                    System.out.print(" " + symbol2);
                }
                else if (r > c)
                {
                    System.out.print(" " + symbol3);
                }
                else
                {
                    System.out.print(" " + symbol4);
                }
                
            }
            System.out.println();
        }
    }
}
    

