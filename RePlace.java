public class RePlace {
    public static void main(String[] args) {
        String str1 = "Строка — это ? упорядоченная ## последовательность ? символов.";
        str1 = (str1.replace("?", "HELLO"));
        String str2 = str1.replace("#", "");
        System.out.println(str2);
    }
}

