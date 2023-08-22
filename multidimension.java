import java.util.* ;

public class multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][3];
//        for (int row = 0 ;row < arr.length; row++) {
//            for (int col = 0 ;col < arr[row].length; col++) {
//                arr[row][col]= in.nextInt();
//            }
//        }
//        // output
//        for (int row = 0 ;row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//            }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        list.add(43);
//        list.add(21);
//        list.add(12);
//        list.add(23);
//        list.add(55);
//        System.out.println(list);
//        list.set(0, 542);
//        System.out.println(list);
        //initialise
        for (int i=0; i<5; i++ ) {
            list.add(new ArrayList<>());
        }
        //add element
        for (int i=0; i<3; i++ ) {
            for (int j = 0 ; j<3; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

        }
    }
