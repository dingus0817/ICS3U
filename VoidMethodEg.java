import java.util.Scanner;
public class VoidMethodEg {
    public void drawTriangle(int h){
        for (int i = 1; i <= h; i++)
        {
            for (int j = 1; j <= h - (h-i); j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the height of the 45-45-90 triangle:" );
        int height = scan.nextInt();
        drawTriangle(height);
    }
    
}
