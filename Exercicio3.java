package com.poo.listas.logica4.lista3;
import java.util.Scanner;

    public class Exercicio3 {

         /*3) Escreva um código que receba dois números inteiros e escreva todos os
              números pares entre eles. */

     public static void resolucao(){

        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        Scanner leia = new Scanner(System.in);
        num1 = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();

        System.out.println("Os números pares entre " + num1 + " e " + num2 + " são: ");


            for (int i = num1; i <= num2; i++) {

             if(i % 2==0){
                System.out.println(i);
            }
        } 
    }
}


