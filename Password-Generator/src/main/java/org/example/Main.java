package org.example;

import at.favre.lib.crypto.bcrypt.BCrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PasswordOutput output = new PasswordOutput();
        Scanner user = new Scanner(System.in);
        output.output();

        System.out.println("Press [y] to continue or [x] to exit the program");
        char userDecision = user.next().charAt(0);

        if (userDecision == 'y') {
            output.output();
        }

    }
}