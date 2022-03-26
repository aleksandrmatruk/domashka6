package ru.skypro;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Задание 3");
        System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replace(" ", "; ") );
        System.out.println("Задание 4");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));

    }
}
