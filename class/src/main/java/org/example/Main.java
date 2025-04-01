package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
public class Main {
    public static void generatePassword(int lenght, String characters) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < lenght; i++) {
          int index = random.nextInt(characters.length());
          password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        String characters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        int length = 10;

        System.out.println("Пароль: "+ generatePassword(characters, length));

    }
}