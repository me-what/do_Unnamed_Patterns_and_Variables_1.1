import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] orderIDs = {34, 45, 23, 27, 15};
        int total = 0;
        for (int id : orderIDs) {
            total++;
        }
        System.out.println("Total: " + total); // total 5
        System.out.println();

        // 2
        int[] orderIDs_2 = {34, 45, 23, 27, 15};
        int total_2 = 0;
        for (int _ : orderIDs_2) {
            total_2++;
        }
        System.out.println("Total: " + total_2); // total 5
        System.out.println();

        stringLength("1"); // Length of 1: 1
        stringLength("100"); // Length of 100: 3

        validateNumber("2147483647"); // 2147483647 is valid
    }

    // Заголовок расширенного for цикла
    static void stringLength(String s) {
        int len = 0;
        for (char _ : s.toCharArray()) {
            len++;
        }
        System.out.println("Length of " + s + ": " + len);
    }

    // Параметр исключения catch блока
    static void validateNumber(String s) {
        try {
            int i = Integer.parseInt(s);
            System.out.println(i + " is valid");
        } catch (NumberFormatException _) {
            System.out.println(s + " isn't valid");
        }
    }
}
