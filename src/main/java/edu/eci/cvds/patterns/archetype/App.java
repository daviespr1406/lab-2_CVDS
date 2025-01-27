package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App
{     public static void main(String[] args) {
    String name = "World";
    String lastName = "";

    if (args.length > 0) {
        name = args[0];
    }
    if (args.length > 1) {
        lastName = args[1];
    }

    if (!lastName.isEmpty()) {
        System.out.println("Hello " + name + " " + lastName + "!");
    } else {
        System.out.println("Hello " + name + "!");

    }
 }
}