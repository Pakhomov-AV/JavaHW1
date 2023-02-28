//Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.

package org.example.seminar1.hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите колличество чисел в последовательности: ");
            int n = scanner.nextInt();
            System.out.println("Вводите числа последовательности по одному: ");
            int num1 = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                int num2 = 0;
                if (i != n - 2) {
                    num2 = scanner.nextInt();
                } else {
                    System.out.println(num2);
                }
                if (num1 > 0 && num2 < 0) {
                    sum += num1;
                }
                num1 = num2;
            }
            System.out.println("Сумма положительных чисел, после которых следует отрицательное число: " + sum);
        }
    }
}
