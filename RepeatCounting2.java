//Это решение я взяла с сайта, что ты мне сбросил//
public class RepeatCounting2 {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 8, 5, 3, 3, 9, 2, 2};
        int[] c = new int[10];
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]]++;
            System.out.println(c[arr[i]]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("number " + i + " repeats " + c[i]);
        }
    }
}
