package RockPaperScissors;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir tam sayı girin: ");
            int tamSayi = scanner.nextInt();

            System.out.print("Bir ondalıklı sayı girin: ");
            double ondalikliSayi = scanner.nextDouble();

            // Tam sayıyı ondalıklı sayıya dönüştürme
            double tamSayiOndalikli = (double) tamSayi;

            // Ondalıklı sayıyı tam sayıya dönüştürme
            int ondalikliSayiTam = (int) ondalikliSayi;

            System.out.println("Tam sayıdan ondalıklı sayıya dönüşüm: " + tamSayiOndalikli);
            System.out.println("Ondalıklı sayıdan tam sayıya dönüşüm: " + ondalikliSayiTam);

            scanner.close();
        }
    }

