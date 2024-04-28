package estruturas;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
	public static void main(String[] args) {
		
//			Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de 
//			livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//			1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//			2: Listar todos os livros da Pilha
//			3: Retirar um livro da pilha 
//			0: O programa deve ser finalizado. 
//			Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
		
		Scanner leia = new Scanner (System.in);
		Stack<String> livro = new Stack<String>();
		String element;
		int pilha = -1;
		
		do {
			
	
		System.out.println("""
				*****************************************
				
				1 - Adicionar Livro na pilha
				2 - Listar todos os Livros 
				3 - Retirar Livro da Pilha
				0 - Sair 
				
				*****************************************
				
				Entre com a opção desejada!
				""");
		
		System.out.println("Digite uma opção: ");
		pilha = leia.nextInt();
		leia.nextLine();
		
		switch(pilha) {
		case 0:
			System.out.println("Programa finalizado! ");
			break;
		case 1:
			System.out.println("Adicionar Livro a Pilha: ");
			System.out.println("Livro: \n");
			String objeto = leia.nextLine();
			livro.push(objeto);
			for ( String book : livro ) {
				System.out.println(book);
			}
			System.out.println("\n Livro Adicionado!");
			break;
		case 2:
			System.out.println("Listar Todos os Livros: \n ");
			for (String book : livro) {
				System.out.println(book);
			}
			break;
		case 3:
			if(livro.isEmpty()) {
				System.out.println("Nenhum livro encontrado! ");
		} else { 
			String book = livro.pop();
			System.out.println("Livro removido: " + book);
		}
			break;
		default: 
			System.out.println("Opção não encontrada!");
		}
		
		} while (pilha !=0);

	}
}

