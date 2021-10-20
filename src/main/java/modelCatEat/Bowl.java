package modelCatEat;

public class Bowl {
    
    private int food;
    private String foodname;

    public Bowl(String foodname, int food) {
        this.food = food;
        this.foodname = foodname;
    }

    public int getFood() {
        return food;
    }

    public String getFoodname() {
        return foodname;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    //Методы выводящий информацию о содержимом миски
    public void info() {
        System.out.println("Хозяйка положила в миску " + food + " гр " + foodname);
        System.out.println();
    }

    //Метод добавления еды в миску
    public void addFood(int n) {
        this.food = food + n;
        System.out.println("Хозяйка добавила еды, и теперь в миске " + this.food + " гр " + foodname);
    }
}

