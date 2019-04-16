import java.util.*;

public class Ruble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число ");
        int rubl = s.nextInt();

        if (rubl % 10 == 1 && rubl % 100 != 11){
            System.out.print(rubl + " рубль");}
        else
        if (2 <= rubl % 10 && rubl % 10 <= 4) {
            System.out.print(rubl + " рубля");
        } else {
            System.out.print(rubl + " рублей");
        }
    }
}

