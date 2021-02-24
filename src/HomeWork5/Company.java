package HomeWork5;

public class Company {
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Company(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        //System.out.println("ФИО: "+name+"ДОЛЖНОСТЬ: "+position+" ЭЛ.ПОЧТА: "+email+
        //      "НОМЕР: "+(phoneNumber)+"ЗАРПЛАТА: "+(salary)+"ВОЗРАСТ: "+(age));
    }

    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phoneNumber, salary, age);
    }


    public void print() {
        System.out.println(this);
    }


    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

}
