package com.mycompany.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cual es tu número? ");
            rp = scanner.nextInt();
            if (rp == 1234){
                fl = true;
            }
        } while (vida < 3 && !fl);
        if (fl){
            System.out.println("Adivinaste!!!");
        }
        else
            System.out.println("ups, perdiste...");
    }
}