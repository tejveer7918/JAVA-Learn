import java.util.Arrays;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
        static void change (int[] arr) {
            arr[2] = 33;
        }
    }

