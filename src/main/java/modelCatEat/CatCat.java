package modelCatEat;

public class CatCat {
    private String name;
    private int appetite;

    public CatCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public String getName() {

        return name;
    }

    public int getAppetite() {

        return appetite;
    }

    //Метод кормления кота
    public void eat(Bowl b) {
        b.decreaseFood(appetite);
    }
}
