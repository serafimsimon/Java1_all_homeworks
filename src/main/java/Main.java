//Создание объектов подклассов
public class Main {

    public static void main(String[] args) {
//Создание объекта подкласса "Кот"
        Cat cat = new Cat("Барсик", 20, 15);
        cat.AnimalInfo(cat.getName());
        cat.AnimalRun(cat.getRunway());
        cat.AnimalSwim(cat.getWaterway());
//Создание объекта подкласса "Кот"
        Cat Abissin = new Cat("Маркиз", 201, 15);
        Abissin.AnimalInfo(Abissin.getName());
        Abissin.AnimalRun(Abissin.getRunway());
        Abissin.AnimalSwim(Abissin.getWaterway());
//Создание объекта подкласса "Собака"
        Dog dog = new Dog("Бобик", 200, 10);
        dog.AnimalInfo(dog.getName());
        dog.AnimalRun(dog.getRunway());
        dog.AnimalSwim(dog.getWaterway());
//Создание объекта подкласса "Собака"
        Dog Alabay = new Dog("Эдик", 501, 25);
        Alabay.AnimalInfo(Alabay.getName());
        Alabay.AnimalRun(Alabay.getRunway());
        Alabay.AnimalSwim(Alabay.getWaterway());

    }
}
