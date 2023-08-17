package org.example.exceptions.homeWork3;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDataApp {

    public static void main(String[] args) {
        try {
            String input = "Петров иван Сидорович 01.01.2000 1234567890 m";
            processUserData(input);
        } catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void processUserData(String input) throws IllegalArgumentException, IOException {
        String[] data = input.split("\\s+");
        if (data.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных");
        }

        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];
        String birthDateStr = data[3];
        String phoneNumberStr = data[4];
        String genderStr = data[5];

        if (!isValidName(lastName) || !isValidName(firstName) || !isValidName(middleName)) {
            throw new IllegalArgumentException("Неверный формат ФИО");
        }

        if (!isValidDate(birthDateStr)) {
            throw new IllegalArgumentException("Неверный формат даты рождения");
        }

        if (!isValidPhoneNumber(phoneNumberStr)) {
            throw new IllegalArgumentException("Неверный формат номера телефона");
        }

        if (!isValidGender(genderStr)) {
            throw new IllegalArgumentException("Неверный формат пола");
        }

        String fileName = lastName + ".txt";
        File file = new File(fileName);
        file.createNewFile();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\n" + lastName + " " + firstName + " " + middleName + " " +
                    birthDateStr + " " + phoneNumberStr + " " + genderStr);
        }
    }

    private static boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("[а-яА-Я]+");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    private static boolean isValidDate(String date) {
        Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}");
        Matcher matcher = pattern.matcher(date);
        if (!matcher.matches()) {
            return false;
        }

        String[] parts = date.split("\\.");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 2100) {
            return false;
        }

        return true;
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    private static boolean isValidGender(String gender) {
        return gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f");
    }
}