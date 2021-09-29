//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Personality {

    private String personalityName;
    private String position;
    private String eMaleAdress;
    private String phoneNumber;
    private int payment;
    private int age;

    //2. Конструктор класса, заполняющий поля при создании объекта.

    public Personality(String personalityName, String position, String eMaleAdress, String phoneNumber, int payment, int age) {
        this.personalityName = personalityName;
        this.position = position;
        this.eMaleAdress = eMaleAdress;
        this.phoneNumber = phoneNumber;
        this.payment = payment;
        this.age = age;
    }

    //Геттеры для полей класса Personality
    public String getPersonalityName() {
        return personalityName;
    }

    public String getPosition() {
        return position;
    }

    public String geteMaleAdress() {
        return eMaleAdress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getPayment() {
        return payment;
    }

    public int getAge() {
        return age;
    }

    //3. Метод, печатающий в консоль информацию о сотруднике
    public void printInfo() {
        System.out.println("ФИО: " + personalityName + System.lineSeparator() + "Должность: " + position + System.lineSeparator() + "E-mail: " + eMaleAdress + System.lineSeparator() + "Номер телефона: " + phoneNumber + System.lineSeparator() + "Зарплата: " + payment + System.lineSeparator() + "Возраст: " + age);
        System.out.println();
    }

}












