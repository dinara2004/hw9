package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
            }}
    }
}
