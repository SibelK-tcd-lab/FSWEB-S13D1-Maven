package org.example;

public class Main {
    public static void main(String[] args) {
        // Test etmek istersen burayı kullanabilirsin:
        // System.out.println(numberToWords(123)); // "One Two Three"
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";

        char[] digits = String.valueOf(number).toCharArray();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();

        for (char digit : digits) {
            int index = Character.getNumericValue(digit);
            result.append(words[index]).append(" ");
        }

        return result.toString().trim();
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || !isBarking) return false;
        return hourOfDay < 8 || hourOfDay >= 20;
    }

    public static boolean hasTeen(int first, int second, int third) {
        return (first >= 13 && first <= 19) ||
                (second >= 13 && second <= 19) ||
                (third >= 13 && third <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int limit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= limit;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }

    public static boolean isPalindrome(int number) {
        int absNumber = Math.abs(number);
        int original = absNumber;
        int reverse = 0;

        while (absNumber > 0) {
            int lastDigit = absNumber % 10;
            reverse = (reverse * 10) + lastDigit;
            absNumber = absNumber / 10;
        }
        return original == reverse;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}