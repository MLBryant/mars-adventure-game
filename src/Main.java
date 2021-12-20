import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The game is about to start...");
        System.out.println("Booting up...");
        for (int i = 0; i < 3; i++) System.out.println("...");
        System.out.println("Ready");

        System.out.println("Hi there. What's your name?");
        String name = input.nextLine();

        System.out.println(String.format("Hi, %s --- Welcome to the Mars Adventure Game!", name));
        System.out.println("Yesterday, you received a call from your good friend at NASA.");
        System.out.println("They need someone to go to Mars this weekend, and you've been chosen.");

        System.out.println("Are you excited? Type Y or N");
        String maybe = input.nextLine();

        if (maybe.equals("Y")) {
            System.out.println("I knew you'd say that. It's so cool that you're going to Mars!");
        }
        else if (maybe.equals("N")) {
            System.out.println("What a shame, didn't think you'd be one to chicken out.");
            System.exit(42);
        } else {
            System.out.println("Well, if you can't follow simple instructions like these, I don't think you're fit for space travel");
            System.exit(42);
        }

        System.out.println("It's time to pack for your trip to Mars");
        System.out.println("How many suitcases do you plan to bring?");
        int luggage = input.nextInt();
        input.nextLine();

        if (luggage > 2) {
            System.out.println("That's way too many. You'll have to pack more lightly.");
            System.out.println("Please try to fit your stuff into 2 suitcases.");
        } else if (0 <= luggage && luggage <=2) {
            System.out.println("Man, you know how to pack! Hope you have everything you need.");
        } else {
            System.out.println("You can't take cargo off the shuttle...");
            System.out.println("Please pack your belongings in no more than 2 suitcases.");
        }

        System.out.println("You're allowed to bring one companion animal with you");
        System.out.println("What kind of animal would you like to bring?");
        String pet = input.nextLine();
        System.out.println("What is your companion's name?");
        String petName = input.nextLine();
        System.out.println(String.format("Cool, so you're bringing %s the %s.", petName, pet));

        System.out.println("NASA has an interior design team offering to outfit your space ship.");
        System.out.println("You have a couple of options for the interior decor of your ship.");
        System.out.println("Your options are:");
        System.out.println("\t A Sleek, modern minimalism");
        System.out.println("\t B Retro/vintage space age");
        System.out.println("\t C SF Hippie chic");
        System.out.println("Which decor would you like? Choose A, B, or C.");
        String decor = input.nextLine();
        String decorStyle = "";

        if (decor.equals("A")) {
            decorStyle = "Sleek";
        } else if (decor.equals("B")) {
            decorStyle = "retro";
        } else if (decor.equals("C")) {
            decorStyle = "hippie";
        } else {
            System.out.println("You're input did not match a selection. You're space ship's decor style will be \"trash can\"");
            decorStyle = "trashy";
        }
        System.out.println("I can see it now:");
        System.out.println(String.format("%s and %s surfing the celestial abyss...", name, petName));
        System.out.println(String.format("in a %s spaceship.", decorStyle));
        System.out.println(String.format("%s -- the day is here!", name));
        System.out.println(String.format("You crawl into your %s spaceship with %s.", decorStyle, petName));
        System.out.println("Brace for take off!");
        for (int i = 5; i > 0; i--) {
            System.out.println(String.format("%s ...", i));
        }
        System.out.println("* LIFTOFF *");
        System.exit(0);

    }
}
