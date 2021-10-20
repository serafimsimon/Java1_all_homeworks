//Подкласс "Кот". Наследуется от родительского класса "Животное"
public class Cat extends Animal {
    public Cat(String name, int runway, int waterway) {
        super(name, runway, waterway);
    }

    //реализация абстактного метода "Инфо"
    @Override
    public void AnimalInfo(String name) {
        System.out.println("Котик: " + name);
    }

    //переопределение метода "Плавать"
    @Override
    public void AnimalSwim(int waterway) {
        System.out.println(getName() + " не умеет плавать(((");
        System.out.println();
    }

    //переопределение метода "Бегать"
    @Override
    public void AnimalRun(int runway) {
        if (runway > 200) {
            System.out.println(getName() + " сдох, так котики на " + runway + " метров не бегают ");
        } else super.AnimalRun(runway);
    }
}
