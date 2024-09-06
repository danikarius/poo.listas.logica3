package com.poo.listas.logica4.lista3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
	
public class Lista3Application {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Lista3Application.class, args);
        
		String opcao;
		Scanner scanner = new Scanner(System.in);
        
		do {
            System.out.println("\n|..................................................|\n");
            System.out.println("  |        MENU LISTA 3 DE EXERCÍCIOS             4   |");
            System.out.println("\n|..................................................|\n");
            System.out.println("1) Cronômetro");
            System.out.println("2) Tabuada");
            System.out.println("3) Todos os Pares");
            System.out.println("4) Jogo da Adivinhação");
			System.out.println("5) Login");
			System.out.println("6) Pirâmide");
			System.out.println("7) Retângulo");
			System.out.println("8) Sair");

            System.out.print("\nEscolha um exercício: ");
            
			
			opcao = scanner.nextLine(); 
   
            if ("8".equals(opcao)) { 
                System.out.println("Saindo...");
                break;
            }
            
            switch (opcao) {
                case "1":
					Exercicio1.resolucao();
                    break;
                case "2":
					Exercicio2.resolucao();
                    break;
                case "3":
					Exercicio3.resolucao();
                    break;
				case "4":
					Exercicio4.resolucao();
                    break;
				case "5":
					Exercicio5.resolucao();
                    break;
				case "6":
					Exercicio6.resolucao();
                    break;
				case "7":
					Exercicio7.resolucao();
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
			
        } 
		while (!"8".equals(opcao)); 

		scanner.close();
	}

}
