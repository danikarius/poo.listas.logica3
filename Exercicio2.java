package com.poo.listas.logica4.lista3;
import java.util.Scanner;


public class Exercicio2 {
   

    /*2) Desenvolva um programa que receba um número 
         do usuário e escreva a tabuada dele.*/


         public static void resolucao()throws InterruptedException{

            int num1, resultado;
        
            System.out.print("Digite um numero para visualizar a tabuada dele: \n");
            Scanner leia = new Scanner(System.in);
            num1 = leia.nextInt();
        
            for (int tabuada = 0; tabuada <= 10; tabuada ++) {
                resultado = num1 * tabuada;
                System.out.println(num1 + " x " + tabuada + " = " + resultado);
            }
        }
        }