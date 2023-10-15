package mihoyo;

import java.util.*;
import java.util.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        List<String> expression = generateExpression(x);
        for (int i = 0; i < expression.size(); i++) {
            if (i > 0) {
                System.out.print(expression.get(i));
            } else {
                System.out.print(expression.get(i));
            }
        }
    }

    private static List<String> generateExpression(int x) {
        List<String> result = new ArrayList<>();

        int power = 0;
        while (x > 0) {
            int remainder = x % 5;
            int quotient = x / 5;

            if (remainder == 1) {
                if (power == 0) {
                    result.add("5");
                } else {
                    result.add("+ 5");
                }
            } else if (remainder == 4) {
                if (power == 0) {
                    result.add("- 5");
                } else {
                    result.add("- 5");
                }
                quotient++;
            } else if (remainder == 2) {
                result.add("+ 2*5");
            } else if (remainder == 3) {
                result.add("- 2*5");
                quotient++;
            }


            x = quotient;
            power++;
        }

        // 移除第一项前面的正号
        if (result.get(0).startsWith("+")) {
            result.set(0, result.get(0).substring(2));
        }

        return result;
    }
}





