import java.util.*;
public class Ruble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rubl = s.nextInt();
        if (rubl % 10 == 0) {
            System.out.print(rubl + " рублей");
        } else {
            System.out.print("");
        }
        if (11 <= rubl && rubl <= 19) {
            System.out.print(rubl + " рублей");
        } else {
            System.out.print("");
            if (2 <= rubl % 10 && rubl % 10 <= 4) {
                System.out.print(rubl + " рубля");
            } else {
                System.out.print("");
            }
            if (5 <= rubl % 10 && rubl % 10 <= 9) {
                System.out.print(rubl + " рублей");
            } else {
                System.out.print("");
            }
        }
    }
}
