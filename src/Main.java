public class Main {
    public static void main(String[] args) {
        // task 1

        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = lastName;
        fullName += " " + firstName;
        fullName += " " + middleName;
        System.out.println("Ф. И. О сотрудника " + fullName);

        // task 2

        System.out.println("\nЗадача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        // task 3

        System.out.println("\nЗадача 3");

        fullName = "Иванов";
        fullName += " Семён";
        fullName += " Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}
