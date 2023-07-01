package org.example;

/**
 * Class for show info
 */
public class Decorator {
    /**
     * Method for show you name and you age in terminal
     * @param name - name user
     * @param age - age user
     */
    public static void helloUser(String name, int age) {
        System.out.println("Здраствуйте, " + name + "! Ваш возраст: " + age);
    }
}