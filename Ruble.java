public class Ruble {
    public static void main(String[] args) {
        int rubl = 5000;
        if (rubl % 10 == 0) {
            System.out.print(rubl + " рублей");
        } else {
            System.out.print("");
        }
        if (rubl % 10 == 1) {
            System.out.print(rubl + " рубль");
        } else {
            System.out.print("");
        }
        if (rubl % 10 == 2) {
            System.out.print(rubl + " рубля");
        } else {
            System.out.print("");
        }
        if (rubl % 10 == 3) {
            System.out.print(rubl + " рубля");
        } else {
            System.out.print("");
        }
        if (rubl % 10 == 4) {
            System.out.print(rubl + " рубля");
        } else {
            System.out.print("");
        }
        if (rubl % 10 == 5) {
            System.out.print(rubl + " рублей");
        } else {
            System.out.print("");
        }
        if (rubl % 10 == 6) {
            System.out.print(rubl + " рублей");
        } else {
            System.out.print("");
            if (rubl % 10 == 7) {
                System.out.print(rubl + " рублей");
            } else {
                System.out.print("");
                if (rubl % 10 == 8) {
                    System.out.print(rubl + " рублей");
                } else {
                    System.out.print("");
                    if (rubl % 10 == 9) {
                        System.out.print(rubl + " рублей");
                    } else {
                        System.out.print("");
                    }
                }
            }
        }
    }
}
