package tarefa_colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class parte1ListaOrdenada {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os nomes dos alunos separados por vírgula: ");
		
		String input = s.nextLine();
		String[] valoresArray = input.split(",");
		List<String> valoresList = new ArrayList<>();//converti o array para lista
		for (String valor : valoresArray) {
			valoresList.add(valor.trim());
		}
		
		Collections.sort(valoresList);//organizei em ordem alfabética
		valoresArray = valoresList.toArray(new String[0]);//converti de volta
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println("Aluno " + (i + 1) + ": " + valoresArray[i].trim());
		}
		
		s.close();
		
	}
		
		
		
		/*
		List<String> valoresList = new ArrayList<>(Arrays.asList(valoresArray));//converti o array para lista
		Collections.sort(valoresList);//organizei em ordem alfabética
		valoresArray = valoresList.toArray(new String[0]);//converti de volta
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println("Aluno " + (i + 1) + ": " + valoresArray[i].trim());
		}
		
		s.close();
		
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os nomes dos alunos separados por vírgula: ");
		
		String input = s.nextLine();//lendo a lista 
		String[] valores = input.split(",");//o split separa os valores e a parte esquerda guarda os valores em um array
		
		Collections.sort(valores);
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Aluno " +(i+1)+": " + valores[i].trim());
		}
		
		
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os nomes da lista separados por vírgula: ");
		List<String> lista = new ArrayList<>();
		
		String aluno = s.nextLine();//leu a lista separada por virgula
		String[] listaluno = aluno.split(",");//separou os valores lidos e guardou em um array
		
		for (String nome : listaluno) {//percorre a lista
			lista.add(nome.trim()); //adiciona o nome à lista/o trim vai remover os espaços em branco nas extremidades
		}
		
		Collections.sort(lista);//ordena a lista
		
		n = lista.length 
		System.out.println("Lista de alunos: " + lista);
		//Collections.sort<listaluno>;
		//System.out.println(listalunos);
		
		
	}
	*/
		
}
