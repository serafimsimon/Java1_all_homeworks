import java.awt.*;

/*
*
*Created by Inna Lukina on 07.09.2021
*
*/
public class HomeWorkApp {
   public static void main(String[] args) {
       PrintThreeWords();
          checkSumSign();
          printColor();
          compareNumbers();

   }
    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign() {

        int a = 10;
        int b = -10;
        if (a+b >= 0) {
        System.out.println("Сумма положительная");
        }
                  else   System.out.println("Сумма отрицательная");
               }


     public static void printColor() {

       int value = 101;

       if (value <= 0) {

           System.out.println("Красный");
       }
       if (value > 0 & value <= 100) {

           System.out.println("Желтый");
       }
       if (value > 100) {

           System.out.println("Зеленый");
       }
     }

     public static void compareNumbers() {

       int a = 2;
       int b = 2;

       if (a >= b) {

           System.out.println("a >= b");
       }
       else {

           System.out.println("a < b");
       }
     }
}


