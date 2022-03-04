package com.company;

public class Main {

    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }

        //2

        for (int j = 100; j > 0; j--) {
            System.out.print(j + " ");
        }
        {
            System.out.println();
        }

        //3

        for (int i = 0; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }

        //4

        for (int i = 1; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        {
            System.out.println();
        }

        //5

        for (int i = 1; i <= 91; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 2; i <= 92; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 3; i <= 93; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 4; i <= 94; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 5; i <= 95; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 6; i <= 96; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 7; i <= 97; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 8; i <= 98; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 9; i <= 99; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }
        for (int i = 10; i <= 100; i = i + 10) {
            System.out.print(i + "   ");
        }
        {
            System.out.println();
        }

        //6

        for (int i = 1; i <= 5; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("   *   ");
            }
            System.out.println();
        }

        //7

        int j = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + j + "=" + j * i);
        }

        //8


        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(i + " x " + a + " = " + i * a + "   ");
            }
            System.out.println();
        }

    }
}


