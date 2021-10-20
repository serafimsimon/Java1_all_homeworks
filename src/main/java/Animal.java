//Абстрактный родительский класс Животное
public abstract class Animal {

    private String name;
    protected int runway;
    protected int waterway;


    public Animal(String name, int runway, int waterway) {
        this.name = name;
        this.runway = runway;
        this.waterway = waterway;

    }

    public String getName() {
        return name;
    }

    public int getRunway() {
        return runway;
    }

    public int getWaterway() {
        return waterway;
    }

    //Абстрактный метод "Инфо" (задет имя животного)
    abstract void AnimalInfo(String name);

    //Метод "Плавать"
    public void AnimalRun(int runway) {
        System.out.println(name + " пробежал " + runway + " метров");
    }

    //Метод "Бегать"
    public void AnimalSwim(int waterway) {
        System.out.println(name + " проплыл " + waterway + " метров");
        System.out.println();
    }

}
