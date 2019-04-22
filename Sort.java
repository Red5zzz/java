public class Sort {
    public static void main(String[] args) {
        int[] e = {4, 2, 3, 7, 10, 28};
        for (int i = 1; i < e.length; i++)
            for (int j = e.length - 1; j >= i; j--) {
                if (e[j - 1] > e[j]) {
                    int t = e[j - 1];
                    e[j - 1] = e[j];
                    e[j] = t;
                }
            }
        for (int i = 0; i < e.length; i++)
            System.out.print(e[i] + ", ");
    }
}
