import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson4 {

    private static char[][] map;
    private static final char X_DOT = 'X';
    private static final char O_DOT = 'O';
    private static final char EMPTY_DOT = '•';
    private static final int mapSize = 5;
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (isWin(X_DOT)) {
                System.out.println("YOU WIN");
                break;
            }
            if (isDraw()) {
                break;
            }
            computerTurn();
            printMap();
            if (isWin(O_DOT)) {
                System.out.println("YOU LOSE");
                break;
            }
            if (isDraw()) {
                break;
            }
        }

    }

    //2. Переделать логику проверки победы, чтобы она не была реализована просто набором условий, использовала циклы
//3*. Переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
    private static boolean isWin(char dot) {
        int chkIJ = 0;
        int chkSwap = 0;
        int chkLine = 0;
        int chkColumn = 0;
        int chkdTop = 0;
        int chkdTopSW = 0;
        int chkdBottom = 0;
        int chkdBottomSW = 0;


//isWin в строках
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == dot) {
                    chkLine = chkLine + 1;
                } else
                    chkLine = 0;
                if (chkLine == mapSize - 1) {

                    return true;
                }
            }

        }
//isWin в столбцах

        for (int j = 0; j < mapSize; j++) {
            for (int i = 0; i < mapSize; i++) {
                if (map[i][j] == dot) {
                    chkColumn = chkColumn + 1;
                } else
                    chkColumn = 0;
                if (chkColumn == mapSize - 1) {
                    return true;
                }
            }

        }

//isWin главная диагональ i = j
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (i == j && map[i][j] == dot) {
                    chkIJ = chkIJ + 1;
                }
                if (chkIJ == mapSize - 1) {
                    return true;
                }
            }
        }

//isWin верхняя боковая диагональ i = j
        for (int i = 0; i < mapSize; i++) {
            for (int j = 1; j < mapSize; j++) {
                if (j == i + 1 && map[i][j] == dot) {
                    chkdTop = chkdTop + 1;
                }
                if (chkdTop == mapSize - 1) {
                    return true;
                }
            }
        }
//isWin нижняя боковая диагональ i = j
        for (int j = 0; j < mapSize; j++) {
            for (int i = 1; i < mapSize; i++) {
                if (i == j + 1 && map[i][j] == dot) {
                    chkdBottom = chkdBottom + 1;
                }
                if (chkdBottom == mapSize - 1) {
                    return true;
                }
            }
        }
//isWin главная диагональ i =! j

        for (int j = 0; j < mapSize; j++) {
            for (int i = 0; i < mapSize; i++) {
                if (j == mapSize - 1 - i && map[i][j] == dot) {
                    chkSwap = chkSwap + 1;
                }
                if (chkSwap == mapSize - 1) {
                    return true;

                }
            }
        }
//isWin верхняя боковая диагональ i =! j
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (j == mapSize - 2 - i && map[i][j] == dot) {
                    chkdTopSW = chkdTopSW + 1;
                }
                if (chkdTopSW == mapSize - 1) {
                    return true;
                }
            }
        }
//isWin нижняя боковая диагональ i =! j
        for (int j = 1; j < mapSize; j++) {
            for (int i = 1; i < mapSize; i++) {
                if (j == mapSize - i && map[i][j] == dot) {
                    chkdBottomSW = chkdBottomSW + 1;
                }
                if (chkdBottomSW == mapSize - 1) {
                    return true;
                }
            }
        }
        return false;
    }


    private static void humanTurn() {
        int xCoordinate;
        int yCoordinate;
        System.out.println("Введите координаты в формате \"x пробел y\"");
        do {
            xCoordinate = -1;
            yCoordinate = -1;

            if (SC.hasNextInt()) {
                xCoordinate = SC.nextInt();
            }
            if (SC.hasNextInt()) {
                yCoordinate = SC.nextInt();
            }
            SC.nextLine();
        } while (!isValidHumanTurn(xCoordinate, yCoordinate));
    }


    private static void computerTurn() {

        int xCoordinate = -1;
        int yCoordinate = -1;
        Random random = new Random();


        do {
            xCoordinate = random.nextInt(mapSize);
            yCoordinate = random.nextInt(mapSize);
        }


        while (!isValidComputerTurn(xCoordinate, yCoordinate));

    }

    private static boolean isValidHumanTurn(int xCoordinate, int yCoordinate) {
        if (xCoordinate < 1 || yCoordinate < 1 ||
                xCoordinate > mapSize || yCoordinate > mapSize) {
            System.out.println("Вы ввели неправильные координаты. Введите координаты в формате \"x пробел y\"");
            return false;
        }

        if (map[xCoordinate - 1][yCoordinate - 1] == EMPTY_DOT) {
            map[xCoordinate - 1][yCoordinate - 1] = X_DOT;
            System.out.println("Ваш ход");
            return true;
        }
        System.out.println("Вы ввели неправильные координаты. Введите координаты в формате \"x пробел y\"");
        return false;
    }

    private static boolean isValidComputerTurn(int xCoordinate, int yCoordinate) {
        if (map[xCoordinate][yCoordinate] == EMPTY_DOT) {
            map[xCoordinate][yCoordinate] = O_DOT;
            System.out.println("Мой ход");
            return true;
        }
        return false;
    }

    private static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void initMap() {
        map = new char[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++) {
            Arrays.fill(map[i], EMPTY_DOT);
        }
    }

    private static boolean isDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        System.out.println("DRAW");
        return true;
    }
}
