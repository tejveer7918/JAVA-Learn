public class maxArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,7};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
