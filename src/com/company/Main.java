package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Este programa escribirá el cuadrado de cada numero hasta el indicado por el usuario\n"+
                "Este procedimiento lo hara por medio de suma de numeros impares");
        System.out.println("\nInserte el número maximo para el calculo");
        n = lectura.nextInt();
        cuadrados(n);

    }

    public static void cuadrados(int base){
        int sumatoria = 0;
        int numUsado = 1;
        System.out.println("\nNúmeros usados para la base: " + base + "----------------------");

        if ( base != 1){
            for (int i = 0; i < base; i++){
                System.out.println(numUsado);
                sumatoria += numUsado;
                numUsado+=2;
            }
            System.out.println("El cuadrado de la base "+ base +" es " +sumatoria);
        }else{
            System.out.println(1);
            System.out.println("El cuadrado de la base 1 es 1");
        };
    }


}
