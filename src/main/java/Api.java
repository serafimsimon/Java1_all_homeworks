import modelCatEat.Bowl;
import modelCatEat.CatCat;

public class Api {

    public static int n;

    public static void main(String[] args) {

        //Создание массива котов
        CatCat[] cat = new CatCat[3];
        cat[0] = new CatCat("Барсик", 150);
        cat[1] = new CatCat("Васька", 200);
        cat[2] = new CatCat("Рыжик", 120);

        //Создание миски с едой
        Bowl bowl = new Bowl("Wiskas", 300);

        //Вызов метода с инофрмацией о еде в миске
        bowl.info();

        //Просим котов поесть из тарелки
        for (int i = 0; i < cat.length; i++) {

            System.out.println("К миске пришел " + cat[i].getName() + ", который ест за раз " + cat[i].getAppetite() + " гр " + bowl.getFoodname());
            System.out.println();

            //если еды в тарелке для кота не достаточно, добавляем еду
            if (cat[i].getAppetite() > bowl.getFood()) {
                n = cat[i].getAppetite() - bowl.getFood();
                System.out.println("И ему не хватило еды. Чтобы накормить котика, хозяйке надо добавить " + n + " гр еды");
                bowl.addFood(n);
            }

            //кот ест
            cat[i].eat(bowl);
            System.out.println("После " + cat[i].getName() + " в миске осталось " + bowl.getFood() + " гр " + bowl.getFoodname());
            System.out.println();
        }
        System.out.println("Коты накормлены");
    }
}





