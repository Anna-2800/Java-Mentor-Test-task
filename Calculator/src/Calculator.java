import java.util.Scanner;

public class Calculator {

    public static void main (String [] args) {
        System.out.println("Введите выражение c двумя целыми числами ");
        Scanner scan = new Scanner(System.in);
        
        if (scan.hasNextInt()) { //если введены арабские цифры
            int num1 = NumScanner.num(scan); //вызываем метод класса NumScanner 
            char operation = OperationScanner.operation(scan);
            int num2 = NumScanner.num(scan);
            int result = calculate(num1, num2, operation); //производим вычисление
            if (result != 101) { //проверка результата
                System.out.println("Результат " + result);
            }
        }
        
        else { // если введены римские цифры
            int num1 = NumRome.arabicNum(scan);
            char operation = OperationScanner.operation(scan);
            int num2 = NumRome.arabicNum(scan);
            int result = Calculator.calculate(num1, num2, operation);
            if (result!=101) { 
            System.out.println("Результат " + NumRome.romanNum(result));
            }
    }
    }
    
    public static int calculate(int num1, int num2, char operation){ //проведение арифметической операции
        int result=101; //присваиваем переменной значение, которое невозможно получить, для того, чтобы понять была ли ошибка
        if (num1>=1 & num1<=10 & num2>=1 & num2<=10){ //диапазон допустимых значений введенных чисел
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ошибка. Неверный тип операции. "); 
            }
        } else {
            System.out.println("Ошибка диапазона. Принимаются числа от 1 до 10 включительно. ");
        }
        return result;
    }
}
