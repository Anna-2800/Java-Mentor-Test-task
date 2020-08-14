import java.util.Scanner;

public class OperationScanner {

    public static char operation(Scanner scan) {
        char oper='a';
        if (scan.hasNext()) {
            oper = scan.next().charAt(0);
        } else {
            System.out.print("Ошибка");
        } return oper;
    }
}
