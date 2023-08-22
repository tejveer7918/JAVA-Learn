public class shadowing {
    static int x = 30;

    public static void main(String[] args) {
        System.out.println(x); // print 90
        int x=40;                           // shadowing is done by giving different value to same variable...
        System.out.println(x);// print 40
        fun();

        }
    static void fun() {
        int x = 80;
        System.out.println(x );

    }
}
