package HT.HT2;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. 
// В этом задании не используем try catch. 
// Пишем регулярное выражение и используем на строке метод matches.

import java.util.*;

public class Task1 {
    static Scanner sc = new Scanner(System.in, "ibm866");

    public static void main(String[] args) {
        System.out.println(floatValid());
    }

    public static float floatValid() {
        System.out.print("Insert float number: ");
        String input = sc.nextLine();
        if (!input.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            throw new NumberFormatException("Format corrupted");
        }

        return Float.parseFloat(input);
    }
}
