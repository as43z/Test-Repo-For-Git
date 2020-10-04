package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        Scanner in = new Scanner(System.in);

        int i = 0;

        System.out.print("Intro a test number: ");
        i = in.nextInt();

        tc.setTestInteger(i);

        System.out.println("The number you entered is: " + tc.getTestInteger());
    }
}
