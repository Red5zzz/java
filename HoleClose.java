public class HoleClose {
    public static void main(String[] args) {
        double heigth, width;
        heigth = 2.8;
        width = 4.1;
        double radius = 4.6;
        double s = heigth * width;
        double diam = radius * 2;
        if (diam > s) {
            System.out.println("Картонка больше отверстия - можно");
        } else {
            System.out.println("Картонка меньше - нельзя");
        }
    }
}

