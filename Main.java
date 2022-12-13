package org.example;

//** Придумайте структуру класса.
//* Опишите класс в программе, создайте json с несколькими экземплярами.
//* В программе с помощью objectMapper преобразуйте json в массив объектов.

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

class Task5 {

    static String input = "[\n" +
            "   {\n" +
            "      \"name\": \"MSI\",\n" +
            "      \"ram\": \"8gb\"\n" +
            "      \"diagonal\": \"13.9\"\n" +
//            "      \"color\": \"grey\"\n" +
            "   }\n" +
            "]\n";

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Notebook> notebooks;
        try {
            notebooks = Arrays
                    .asList(objectMapper.readValue(input, Notebook[].class));
        } catch (Exception e) {
            notebooks = new ArrayList<>();
            System.out.println("JSOn must contain fields name, ram, diagonal, color");
        }

        System.out.println(notebooks);
    }

}
