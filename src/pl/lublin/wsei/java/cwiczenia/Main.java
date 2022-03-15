package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* int a = 3;
        double b = 4.21;
        String s = "Jakiś tekst";

        System.out.println("Hello Java world \n");
        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);
        System.out.print("Nazwaliśmy to \"witaminą B3\"");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));

        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj liczby, które mam dodać: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0) || (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
            } while (true); */

    System.out.printf("Program do wypisania postaci dwójkowej i szesnastkowej.\n Podaj liczbę: ");
    Scanner input = new Scanner(System.in);
    int num1=0;
    num1 = input.nextInt();
    String BIN,HEX;
    BIN = Integer.toBinaryString(num1);
    HEX = Integer.toHexString(num1);
    System.out.printf("DEC = "+num1+"\nBIN = "+BIN+"\nHEX = "+HEX);
    }
}
