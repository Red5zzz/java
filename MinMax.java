public class MinMax {
    public static void main(String[] args) {
        int[] arr = {0, 7, 12, 13, 56, 99, 71, 69, 22, 35};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("\n");
        int min, max;
        min = arr[0];
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("min and max: " + min + " and " + max);
    }
}

