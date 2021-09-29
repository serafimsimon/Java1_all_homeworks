import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Personality1 {
    @Getter
    @Setter
//4. Создание массива из 5 сотрудников
    public static void main(String[] Args) {

        Personality[] Person = new Personality[5];
        Person[0] = new Personality("Петров", "ген.директор", "enene@mail.ru", "83223311132", 150000, 40);
        Person[1] = new Personality("Сидоров", "зам.директора", "ennnn@mail.ru", "83225555566", 100000, 41);
        Person[2] = new Personality("Свиридова", "секретарь ген.директора", "ccclll@mail.ru", "8332223366", 70000, 22);
        Person[3] = new Personality("Попов", "секретарь зам.директора", "aaaoooh@mail.ru", "83223322255", 50000, 23);
        Person[4] = new Personality("Семенова", "фин.директор", "yaoicca@mail.ru", "8325556662", 200000, 45);
        System.out.println("Вывод информации о сотруднике с использованием метода класса: ");
        Person[0].printInfo(); //вызов метода класса Personality
        System.out.println();
        System.out.println("Вывод информации о сотрудниках старше 40 лет:");
        ageFilter(Person);
    }

    //5. Метод выводит информацию о сотрудниках старше 40 лет
    public static void ageFilter(Personality[] Person) {

        for (int i = 0; i < Person.length; i++) {
            if (Person[i].getAge() >= 40) {
                System.out.println("ФИО: " + Person[i].getPersonalityName() + System.lineSeparator() + "Должность: " + Person[i].getPosition() + System.lineSeparator() + "E-mail: " + Person[i].geteMaleAdress() + System.lineSeparator() + "Номер телефона: " + Person[i].getPhoneNumber() + System.lineSeparator() + "Зарплата: " + Person[i].getPayment() + System.lineSeparator() + "Возраст: " + Person[i].getAge());
            }
        }
    }

}










