package org.example;

public class Generator {

    /* Password Generator based on ASCII
       This Generator uses 10 numbers, 26 Uppercase letters
       and 26 lowercase letters
     */
    public char randomizedCharacter() {
        int rand = (int) (Math.random() * 62);

        /* Removed symbols from Generator due to unconventional password generated
        int rand = (int) (Math.random()* 78);
        if (rand <= 6) {
            int symbol = rand + 47;
            return (char) (symbol);
        }
        /*

        /* Generates a number from '0 - 9' based on ASCII
           Converted numbers to char data type
        */

        if (rand <= 9) {
            int number = rand + 48;      // 48 to 57 generates numbers
            return (char) (number);
        }
        /* Generates an Uppercase letter from 'A to Z' based on ASCII
         */
        else if (rand <= 35) {            //65 to 90 on ASCII contain Uppercase letters
            int uppercase = rand + 55;   // converting from 10 to 35  by adding 55 to rand
            return (char) (uppercase);
        }
        /* Generates a lowercase letter from 'a to z' based on ASCII
         */
        else {
            int lowercase = rand + 61;   // add 61 to rand because 97 starts with lowercase letters
            return (char) (lowercase);
        }
    }
}
