public class Task1 {
    public static void main(String[] args) {
        String str = "Самый лучший день";
        int length = str.length();
        int mid = length / 2;
        System.out.println("Длина строки " + length + " символов");
        String[] parts = {str.substring(0, mid), str.substring(mid)};
        System.out.println(parts[0]);
        System.out.println(parts[1]);
    }
}












