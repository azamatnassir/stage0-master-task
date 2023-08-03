package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            int j = cathetusLength;
            int k = 2;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
