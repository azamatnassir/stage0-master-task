package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reverse = 0;
        int remainder;

        while (number != 0) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }

        System.out.println(reverse);
    }

}
