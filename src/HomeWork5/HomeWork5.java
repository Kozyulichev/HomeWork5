package HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Company company1 = new Company("Иванов Василий Петрович ", "Руководитель ",
                "ivanov@mail.ru ", "98864  ", 65000, 45);
        Company company2 = new Company("Петров Петр Петрович ", "Водитель ", "petrov@yande.ru ",
                "99999  ", 24000, 20);
        Company company3 = new Company("Алекссев Алексей Алексеевич ", "Большой босс ",
                "bigboss@company.com ", "77777 ", 7777777, 41);
        Company company4 = new Company("Жданов Кирилл Сергеевич ", "Нач.СБ ",
                "security@company.com ", "545454545 ", 56000, 52);
        Company company5 = new Company("Сережка", "Сын руководителя",
                "major777@777.ru", "77778", 0, 22);
        Company[] person = new Company[5];
        person[0] = company1;
        person[1] = company2;
        person[2] = company3;
        person[3] = company4;
        person[4] = company5;
        for (int i = 0; i < person.length; i++) {
            if (person[i].age > 40) {
                System.out.println(person[i]);
            }

        }


    }
}
