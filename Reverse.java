import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {4, 8, 7, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}




