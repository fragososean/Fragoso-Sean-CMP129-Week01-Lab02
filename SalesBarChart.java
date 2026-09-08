package Labs.Week_1.scr;

import java.util.Scanner;
public class SalesBarChart {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int s, x;
        double p;
        String ast = "";
        System.out.print("Enter the number of stores: ");
        s = input.nextInt();

        for (x=0; x<s; x++){
            System.out.print("Enter Today's Sales for Store "+(x+1)+": ");
            double y = input.nextDouble();
            y = y/100;

            for (p=0; p<y; p++){
                ast = ast+"*";
            }
            ast = ast+"\n";
        }
        System.out.print(ast);
    }   
}
