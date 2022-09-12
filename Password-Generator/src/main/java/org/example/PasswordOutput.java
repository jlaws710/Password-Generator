package org.example;

import at.favre.lib.crypto.bcrypt.BCrypt;

import java.util.Scanner;

public class PasswordOutput {

    public void output() {

        Scanner user = new Scanner(System.in);
        String password = "";
        try {
            System.out.println("Password Generator\n");

            System.out.println("Enter length of password: ");
            int num = user.nextInt();

            Generator randomGenerator = new Generator();
            for (int i = 0; i < num; i++) {
                password += randomGenerator.randomizedCharacter();
            }
            String hashed = BCrypt.withDefaults().hashToString(10, password.toCharArray());
            System.out.println("Password: " + password);
            System.out.println("Hashed Password: " + hashed);



        } catch (Exception ex) {
            System.out.println("Error: Invalid Input");
        }
    }
}
