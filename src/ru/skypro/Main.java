package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task8();

    }

    public static void task5() {
        String fullName = "Солдатов Дмитрий Сергеевич";
        int x = fullName.indexOf(" ") + 1;
        int y = fullName.lastIndexOf(" ") + 1;
        String middleName = fullName.substring(y);
        String firstName = fullName.substring(x,y);
        String lastName = fullName.substring(0,x);
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }

    public static void task6() {
        String fullName = "солдатов дмитрий сергеевич";
        int firstLetter = fullName.indexOf(" ") + 1;
        int lastLetter = fullName.lastIndexOf(" ") + 1;
        char[] arrayChars = fullName.toCharArray();
        arrayChars[0] = Character.toUpperCase(arrayChars[0]);
        arrayChars[firstLetter] = Character.toUpperCase(arrayChars[firstLetter]);
        arrayChars[lastLetter] = Character.toUpperCase(arrayChars[lastLetter]);
        for (int i = 0; i < arrayChars.length; i++) {
            System.out.print(arrayChars[i]);
        }

    }

    public static void task8() {
        String letters = "aabccddefgghiijjkk";
        char[] arrayChars = letters.toCharArray();
        for (int i = 0; i < arrayChars.length - 1; i++) {
            if(arrayChars[i] == arrayChars[i + 1]){
                System.out.print(arrayChars[i]);
            }
        }

    }

}