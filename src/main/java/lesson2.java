import java.util.logging.ConsoleHandler;


public class lesson2 {

    public static void main(String[] args) {

        //Задание №1 */
        int a = 16, b = 5;
        twoNumbers(a, b);
        System.out.println(twoNumbers(a, b));

        //Задание №2 */
        int c = 10;
        oneNumber(c);

        //Задание №3 */
        int d = -10;
        oneNumberBoo(d);
        System.out.println(oneNumberBoo(d));

        //Задание №4 */
        int e = 5;
        String S = "Я одна умная, в белом пальто стою красивая";
        System.out.println("Количество строк:");
        System.out.println(e);
        oneNumberSrting(S, e);

        //Задание №5 */

        float y = 108;
        int Z;
        Z = (int) y;
        leapYear(y);
        System.out.println(Z);
        System.out.println("Високосный");
        System.out.println(leapYear(y));

    }

    //Задание №1. Метод, принимающий на вход два целых числа и проверяющий их сумму */
    public static boolean twoNumbers(int a, int b) {

        if (a + b <= 20 && a + b >= 10) {
            return true;
        }
        return false;

    }

    //Задание №2. Метод, которому в качестве параметра передается целое число. Метод печатает в консоль положительное или отрицательное это число */
    public static void oneNumber(int c) {
        if (c < 0) {
            System.out.println("Передано отрицательное число");
        } else System.out.println("Передано положительное число");
    }


    //Задание №3. Метод, которому в качестве параметра передается целое число. Метод возвращает true, если число отрицательное, false - если положительное */
    public static boolean oneNumberBoo(int d) {
        if (d < 0) {
            return true;
        }
        return false;

    }

    //Задание №4. Метод, которому в качестве аргументов передается строка и число */
    public static void oneNumberSrting(String S, int e) {

        if (e > 0) {
            while (e > 0) {
                System.out.println(S);
                e--;
            }
        } else System.out.println("Введено неверное число строк");
    }

    //Задание №5. Метод, определяющий является ли год високосным */

    public static boolean leapYear(float y) {

        if (y <= 100 && y % 4 == 0) {
            return true;
        } else if (y > 100 && y % 4 == 0 && y % 100 > 0) {
            return true;
        } else if (y > 100 && y % 4 == 0 && y % 400 == 0) {
            return true;
        }
        return false;
    }
}

