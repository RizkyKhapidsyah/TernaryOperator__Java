package com.rizkykhapidsyah.ternaryoperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        int Input, X;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Nilai : ");
        Input = inputUser.nextInt();

        X = (Input == 100) ? (Input * Input) : (Input / 2);  //Ternary Operator

        /*  Jika Menggunakan statement if:
            if (Input == 100) {
                X = Input * Input;
            } else {
                X = Input / 2;
            }
         */

        System.out.println("Hasilnya adalah = " + X);
    }
}
