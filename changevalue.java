
import java.sql.SQLOutput;
import java.util.Scanner;

public class changevalue {
    public static void main(String[] args) {
        double distance;
        int rad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value for radius: ");
        rad = sc.nextInt();
        System.out.println("Circle Pattern:\n");

        for (int row = 0; row<=2 * rad; row++) {
            for (int col = 0; col<=2 * rad; col++) {
                distance = Math.sqrt((row - rad) * (row - rad)
                + (col - rad) * (col - rad));
                if (distance > rad - 0.5 && distance < rad + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }




    }
}

