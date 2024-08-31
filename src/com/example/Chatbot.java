package com.example;

import java.util.Scanner;

public class Chatbot {
    public static void main (String[] arguments) {
        // instatntiating  a Scanner object
        Scanner scanner = new Scanner(System.in); // in : static field
        System.out.println("Hi,I'm Alex,the chatbot you progreammed.");
        System.out.println("May I know your name?");

        String name = scanner.nextLine();
        System.out.println("Nice to meet you," +  name + "!");


        System.out.println("I'm  going to try to guess your age.");
        System.out.println("May I know the remainder of your age divided by 5?");
        int ageMod5 = scanner.nextInt();
        System.out.println(" Thank you! May I know the remainder of your age divided by 7?");
        int ageMod7 = scanner.nextInt();
        System.out.println(" Thank you! May I know the remainder of your age divided by 9?");
        int ageMod9 = scanner.nextInt();

        // deduce the age
        int age = 0;
        int potentialAge = 1;
        while (potentialAge <= 120) {
            if (
                       potentialAge % 5 == ageMod5
                    && potentialAge % 7 == ageMod7
                    && potentialAge % 9 == ageMod9
            ) {
                age = potentialAge;
            }
            potentialAge++;
        }
        if (age == 0) {
            System.out.println("Error: I coudn't identify your age.Most likely, your numbers are incorrect ");
        } else {
            System.out.println("I'hve deduced that your age is"  + age + ":perfect time to learn Java!");
        }
        System.out.println("I can count really  fast! Wanna see? Give me a number");
        int limit = scanner.nextInt();
        for (int counter = 1;counter <= limit; counter++) {
            System.out.println(counter);
        }
        System.out.println("Done! See how fast I was? Going to end the chat now.Have fun!");



    }
}
