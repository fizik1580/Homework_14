import java.util.Scanner;

public class Out_3_var {

    public static void main(String args[]){

                // Program info

        System.out.println("Необходимо написать программу, которая будет реализовывать следующие действия:\n" +
                "1. Ввод числа с клавиатуры и запись его в строковую переменную S\n" +
                "\n" +
                "2. Конвертация строковой переменной S в числовую переменную X типа int\n" +
                "\n" +
                "3. Конвертация числа X типа int в число Y типа double\n" +
                "\n" +
                "\n" +
                "\n" +
                "Все три числа разных типов необходимо в столбик вывести на экран");

                // Var

        String s_string_var;
        int x_integer_var = 0;
        double y_double_var = 0;

                // Data processing

        Scanner str = new Scanner(System.in);
        System.out.print("Введите число: ");
        s_string_var = str.nextLine();

        try {

            x_integer_var = Integer.parseInt(s_string_var);
            y_double_var = (double) x_integer_var;

        }

        catch (java.lang.NumberFormatException e) {

            System.out.println("Format mismatch: слишком большое число (помните что: -2147483649 < integer < 2147483648)");
            System.exit(0);

        }

            System.out.println("String = " + s_string_var +
                    "\n" +
                    "int = " + x_integer_var +
                    "\n" +
                    "double = " + y_double_var);

    }
}
