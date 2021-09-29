package com.programming;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input.
        System.out.println("Enter the number to find the prime factors: ");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println("Prime factors of " + num + " are:");
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    for (int j = 2; j <= i; ++j) {
                        if (i % j != 0) {
                            System.out.println(i);
                        }
                    }
                }
              }
            }
        }
    }

