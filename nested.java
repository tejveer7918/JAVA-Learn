import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruits = in.next();

        switch (fruits) {
            case "mango":
                System.out.println("king");
            case "apple":
                System.out.println("healthy");
                break;

            case "grape":
                System.out.println("small");
                break;


            case "orange":
                System.out.println("round");
                break;

            default:
                System.out.println("invalid");




        }
        }
    }

