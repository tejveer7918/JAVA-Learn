import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

//        int ans = sum2(20,30);
//        System.out.println(ans);
//    }
//
//    static int sum2 (int a , int b) {
//        int sum = a + b;
//        return sum;
//    }
//
////        String message = greet();
////        System.out.println(message);
////    }
////         static String greet() {
////            String greetings = "how are you?";
////            return greetings;
////        }
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter your name:--");
        String name = in.next();
        String personlaised = myGreet(name);
        System.out.println(personlaised);
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }


}
