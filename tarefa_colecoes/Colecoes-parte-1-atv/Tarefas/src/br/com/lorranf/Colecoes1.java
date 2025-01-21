package br.com.lorranf;
import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {//criando classe Pessoa
	String nome;//atributo
	String sexo;//atributo
	
	Pessoa(String nome, String sexo) {//define os atributos para quando Pessoa for criado
		this.nome = nome;
		this.sexo = sexo;
	}
}

public class Colecoes1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Pessoa> listaMasculino = new ArrayList<>();//cria lista p/ h
		ArrayList<Pessoa> listaFeminino = new ArrayList<>();//cria lista p/m
		
		System.out.println("Digite quantas pessoas serão inseridas: ");
		int quantidade = scanner.nextInt();//lê o número
		scanner.nextLine();//vai remover a linha que é criada após ler o número
		
		for (int i = 0; i < quantidade; i++) {//começa em zero, enquanto for menos que a quant pessoas vai receber +1
			System.out.println("Digite seu nome e seu sexo(Masculino ou Feminino):");
			String entrada = scanner.nextLine();
			String[] dados = entrada.split(" ");// split separa
			String nome = dados[0];//recebe o split 1
			String sexo = dados[1];//recebe o split 2
			
			Pessoa p = new Pessoa(nome, sexo);//cria um objeto pessoa(com caracteristicas da classe)
			if (sexo.equalsIgnoreCase("Masculino")) {//se for M
				listaMasculino.add(p);//VAI ADICIONAR O P À LISTA MASCULINA
			}else if (sexo.equalsIgnoreCase("Feminino")){//se dor mulher
				listaFeminino.add(p);//VAI ADD O p À LISTA FEMININA
			}else {//se tiver digitado errado
				System.out.println("Deu algum erro, confira o processo e confira se há algo errado");
			}
		}
		
		System.out.println("\nLista Masculina: ");//imprimi a lista masculina
		for (Pessoa p : listaMasculino) {
			System.out.println(p.nome);
		}
		System.out.println("\nLista Feminina: ");//imprimi a lista feminina
		for (Pessoa p : listaFeminino) {
			System.out.println(p.nome);
		}
	}
	
}
