import java.util.Scanner;

public class NumScanner {

    public static int num (Scanner scan) {
        int num=0;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.print("Ошибка. Введен неверный символ");
        }
        return num;
    }
}
