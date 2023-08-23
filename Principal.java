package com.mycompany.principal;

import java.util.Scanner;
import rega.regalo;

public class Principal {
    public static void main(String[] args){
        int heal, rp;
        boolean fl = false;
        heal = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida: " + heal + "\t¿Cual es tu número? ");
            rp = scanner.nextInt();
            if (rp == 1234){
                fl = true;
            }
        } while (heal < 3 && !fl);
        if (fl){
            System.out.println("Adivinaste!!!");
            regalo.elegir(heal);
        }
        else
            System.out.println("ups, perdiste...");
    }
}