package org.example;

import java.util.Scanner;

/**
 * Class for enter user info and show this info
 */
public class FirstClass {
    Scanner scanner;

    public FirstClass() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Method runs for FirstClass of application
     */
    public void run() {
        String name = setData("Введите имя: ");
        String age_str = setData("Введите возраст");
        int age = 0;
        try {
            age = Integer.parseInt(age_str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        Decorator.helloUser(name, age);

    }

    public String setData(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }


}