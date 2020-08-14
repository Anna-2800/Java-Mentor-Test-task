import java.util.Scanner;
import java.util.Arrays;

public class NumRome {

    public static
    String[] rome = { // создаем массив римских цифр
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", //10
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII","XVIII", "XIX", "XX",//20
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII","XXVIII", "XXIX", "XXX",//30
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII","XXXVIII", "XXXIX", "XL",//40
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII","XLVIII", "XLIX", "L",//50
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",//60
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII","LXVIII", "LXIX", "LXX",//70
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII","LXXVIII", "LXXIX", "XXX",//80
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII","LXXXVIII", "LXXXIX", "XC",//90
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII","XCVIII", "XCIX", "C"//100

    };

    public static int arabicNum (Scanner scan) {
        String romanNum =scan.next(); //сканируем введенные римские цифры 
        return Arrays.asList(rome).indexOf(romanNum)+1; //возвращаем индекс объекта массива увеличенный на 1
    }

    public static String romanNum (int num){
        return rome[num-1]; //возвращаем римскую цифру на основании индекса массива 
    }
}
