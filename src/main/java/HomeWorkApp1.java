public class HomeWorkApp1 {

    public static void main(String[] args) {

        /*Заднание №1. Создать целочисленный массив из 0 и 1. С помощью цикла и условия заменить 1 на 0 и 0 на 1.*/

        arrayInt(0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1);

        /*Задание №2. Задать пустой целочисленный массив длинной 100. С помощью цикла заменить значения на 1 2 3 ... 100*/

        int[] arrayNul = new int[100];
        arrayNull(arrayNul);

        /*Задание №3. Задать массив 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1; пройти по нему циклом, числа меньшие 6 умножить на 2.*/

        int[] array62 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        arrayM62(array62);

        /*Задание №4. Создать квадратный двумерный целочисленный массив, и с помощью циклов заполнить его диагональные элементы единицами.*/
        int[][] array1X1 = new int[5][5];
        arrayM1X1(array1X1);

        /*Задание №5. Написать метод принимающий на вход два аргумента len и initialValue и возвращающий одномерный массив типа int длиной len, каждая ячейка
        которого равна initialValue*/

        int len = 10;
        int initialValue = 1024;

        arrayLen(initialValue, len);

        /*Задание №6. Задать одномерный массив и найти в нем максимальный и минимальный элементы */
        int[] minMax = {-1, 5, -3, 2, 11, 4, 50, 2, 4, 8, 9, 101};
        minMaxM(minMax);

    }

        /*Заднание №1. Создать целочисленный массив из 0 и 1. С помощью цикла и условия заметить 1 на 0 и 0 на 1*/
    public static void arrayInt(int... array1) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            } else array1[i] = 0;
            System.out.print(array1[i] + " ");
        }
        System.out.println();
    }

        /*Заднание №2.Задать пустой целочисленный массив длинной 100. С помощью цикла заменить значения на 1 2 3 ... 100*/

    public static int[] arrayNull(int[] arrayNul) {

        for (int i = 0; i < arrayNul.length; i++) {
            arrayNul[i] = i + 1;
            System.out.print(arrayNul[i] + " ");
        }
        System.out.println();
        return arrayNul;
    }

        /*Задание №3. Задать массив 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1; пройти по нему циклом, числа меньшие 6 умножить на 2*/
    public static int[] arrayM62(int[] array62) {
        for (int i = 0; i < array62.length; i++) {
            if (array62[i] < 6) {
                array62[i] = array62[i] * 2;
            }
            System.out.print(array62[i] + " ");
        }
        System.out.println();
        return array62;
    }

        /*Задание №4. Создать квадратный двумерный целочисленный массив, и с помощью циклов заполнить его диагональные элементы единицами*/
    public static int[][] arrayM1X1(int[][] array1X1) {
        for (int i = 0; i < array1X1.length; i++) {
            for (int j = 0; j < array1X1[i].length; j++) {
                if (i == j || j == array1X1.length - i - 1) {
                    array1X1[i][j] = 1;
                }
                System.out.print(array1X1[i][j] + " ");
            }
            System.out.println();
        }
        return array1X1;
    }

        /*Задание №5. Написать метод принимающий на вход два аргумента len и initialValue и возвращающий одномерный массив типа int длиной len, каждая ячейка
    которого равна initialValue*/
    public static int[] arrayLen(int initialValue, int len) {
        int[] mass = new int[len];
        for (int i = 0; i < len; i++) {
            mass[i] = initialValue;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        return mass;
    }

        /*Заднание №6*. Задать одномерный массив и найти в нем max и min элементы*/
    public static void minMaxM(int[] minMax) {
        int min = minMax[0];
        int Max = minMax[0];
        for (int i = 1; i < minMax.length; i++) {
            if (minMax[i] < min) {
                min = minMax[i];
            }
            if (minMax[i] > Max) {
                Max = minMax[i];
            }
        }
        System.out.print("Min = " + min + "; " + "Max = " + Max);
        System.out.println();
    }
}