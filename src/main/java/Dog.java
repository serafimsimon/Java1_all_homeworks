//Подкласс "Собака". Наследуется от родительского класса "Животное"
public class Dog extends Animal {
    public Dog(String name, int runway, int waterway) {
        super(name, runway, waterway);
    }

    //реализация абстактного метода "Инфо"
    @Override
    public void AnimalInfo(String name) {
        System.out.println("Собаченька: " + name);
    }

    //переопределение метода "Плавать"
    @Override
    public void AnimalSwim(int waterway) {
        if (waterway > 10) {
            System.out.println(getName() + " утонул, так как собачки плавают только на 10 метров ");
            System.out.println();
        } else super.AnimalSwim(waterway);
    }

    //переопределение метода "Бегать"
    @Override
    public void AnimalRun(int runway) {
        if (runway > 500) {
            System.out.println(getName() + " сдох, так собачки на " + runway + " метров не бегают ");
        } else super.AnimalRun(runway);
    }
}
