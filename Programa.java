package trabalho;

import java.util.Scanner;

import trabalho.Funcao;

public class Programa {

	public static void main(String[] args) {

		Funcao<Integer> par = new Funcao<Integer>();
		Funcao<Integer> impar = new Funcao<Integer>();

		Scanner scan = new Scanner(System.in);

		System.out.println("-".repeat(99));
		System.out.println("- ".repeat(50));
		System.out.println("- ".repeat(50));
		System.out.println("- ".repeat(14) + "Programa Simples de Pilhas Pares e Ímpares " + " -".repeat(14));
		System.out.println("- ".repeat(50));
		System.out.println("- ".repeat(50));
		System.out.println("-".repeat(99));

		for (int i=1; i<=30; i++){
					
			System.out.println("".repeat(99));
			System.out.println("Informe um número inteiro qualquer: ");

			int num = scan.nextInt();

			if (num == 0){

				Integer desempilhado = par.desempilha();

				if (desempilhado == null){
					System.out.println("A Pilha dos números pares está vazia");
					} else {
					System.out.println("".repeat(99));
					System.out.println("O número " + desempilhado + " foi desempilhando da pilha PAR");
				}

				desempilhado = impar.desempilha();

				if (desempilhado == null){
					System.out.println("A Pilha dos números ímpares está vazia");
					System.out.println("".repeat(99));
					System.out.println("-".repeat(99));
				} else {
					System.out.println("O número " + desempilhado + " foi desempilhando da pilha ÍMPAR");
					System.out.println("".repeat(99));
					System.out.println("-".repeat(99));
				}


			} else if (num % 2 == 0){
				System.out.println("".repeat(99));
				System.out.println("O número " + num + " foi empilhando na pilha PAR");
				System.out.println("".repeat(99));
				System.out.println("-".repeat(99));
				par.empilha(num);
			} else {
				System.out.println("".repeat(99));
				System.out.println("O número " + num + " foi empilhando na pilha ÍMPAR");
				System.out.println("".repeat(99));
				System.out.println("-".repeat(99));
				impar.empilha(num);
			}
		}

		System.out.println("".repeat(99));
		System.out.println(" ".repeat(27) + "Números desempilhadados da lista PAR:");
		System.out.println("".repeat(99));
		System.out.println("-".repeat(99));
		System.out.println("".repeat(99));

		while (!par.estaVazia()){
			System.out.println("Número: " + par.desempilha());
		}

		System.out.println("".repeat(99));
		System.out.println("-".repeat(99));
		System.out.println("".repeat(99));
		System.out.println(" ".repeat(27) + "Números desempilhadados da lista ÍMPAR:");
		System.out.println("".repeat(99));
		System.out.println("-".repeat(99));
		System.out.println("".repeat(99));

		while (!impar.estaVazia()){
			System.out.println("Número: " + impar.desempilha());
		}
		
		System.out.println("".repeat(99));
		System.out.println("-".repeat(99));
	}

}
