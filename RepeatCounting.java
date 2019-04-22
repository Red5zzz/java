/*Это я сама пробовала решить. Дубликаты я вывести могу, но не могу понять куда счетчик пожно поставить*/
public class RepeatCounting {
    public static void main(String[] args) {
        int[] arr = {1, 8, 4, 8, 5, 3, 3, 9, 2, 2};
        int count;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = arr[i];
                    if (count > 1) {
                        counter++;
                    }
                    System.out.println("number " + count + " repeats " + counter);
                }
            }
        }
    }
}