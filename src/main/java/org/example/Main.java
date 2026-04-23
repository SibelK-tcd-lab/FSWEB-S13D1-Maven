package org.example;

public class Main {
    public static void main(String[] args) {
        // Burayı manuel testlerin için kullanabilirsin
    }

    // --- Havlayan Köpeğimiz ---
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || !isBarking) {
            return false;
        }
        // Akşam 8 (20:00) ile sabah 8 (08:00) arası
        return hourOfDay < 8 || hourOfDay >= 20;
    }

    // --- Yaş Tespiti ---
    public static boolean hasTeen(int first, int second, int third) {
        return (first >= 13 && first <= 19) ||
                (second >= 13 && second <= 19) ||
                (third >= 13 && third <= 19);
    }

    // --- Oyuncu Kedi ---
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int limit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= limit;
    }

    // --- Alan Hesaplama (Overloading) ---
    // Dikdörtgen Alanı
    public static double area(double width, double height) {
        if (width < 0 || height < 0) return -1;
        return width * height;
    }

    // Daire Alanı
    public static double area(double radius) {
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }
}