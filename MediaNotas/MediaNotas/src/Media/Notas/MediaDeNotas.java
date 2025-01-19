package Media.Notas;//declara que a classe está no pacote 'Media.Notas'
import java.util.Scanner;//para receber inf do usuário, é preciso importar
//o Scanner
//Essa parte inicial é o pacote e importação

public class MediaDeNotas { //declara uma classe pública-->'MediaNotas
	public static void main(String[] args) {//esse é o met principal, ponto de entrada do programa: é o método que o Java executa quando o prog é rodado
		//abaixo declaramos as variaveis, e elas vão armazenar as notas
		int n1 = nota(" primeira ");//'nota("primeira") chama o método nota para capturar a primeira nota
		int n2 = nota(" segunda ");
		int n3 = nota(" terceira ");
		int n4 = nota(" quarta ");
		
		mostrarnotas(n1, n2, n3, n4);	
	}
	
	
	public static int nota(String ordem) {//esse é o metódo para capturar as notas
		//o parametro 'ordem' indica qual nota(primeira, segunda...)
		Scanner entrada = new Scanner(System.in);//cria um objeto Scanner para ler a entrada do usuário
		
		System.out.println("Digite a" + ordem + "nota: ");//possibilita digitar a nota atrelada à ordem
		int nota = entrada.nextInt();//recebe a resposta como um INT
		//System.out.printf("A " + ordem + "nota é: "+ nota + "\n");
		return nota;//RETORNA A NOTA CAPTURADA
		//n1 = entrada.nextInt();
		//System.out.printf("A primeira nota é: "+ n1 + "\n");
		//return n1;
	}
	
	public static void mostrarnotas(int n1, int n2, int n3, int n4) {//esse é o método para mostrar as notas e calcular a média
		System.out.printf("A primeira nota é:" + n1 + "\n");
		System.out.printf("A segunda nota é: "+ n2 +"\n");
		System.out.printf("A terceira nota é: "+n3+"\n");
		System.out.printf("A quarta nota é: "+ n4+ "\n");
		
		double med = (n1 + n2 + n3 + n4) / 4.0;
		System.out.printf("A média das notas é: %.1f\n ", med);
	}
	
	
	
	
	/*
	public static int nota2(int n2) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextInt();
		System.out.printf("A segunda nota é: "+ n2 + "\n");
		return n2;
	}
	
	public static int nota3(int n3) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextInt();
		System.out.printf("A terceira nota é: "+ n3 + "\n");
		return n3;
	}
	
	public static int nota4(int n4) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quarta nota: ");
		n4 = entrada.nextInt();
		System.out.printf("A quarta nota é: "+ n4 +"\n");
		return n4;
	}
	
	public static void mostrarnotas(int n1, int n2, int n3, int n4) {
		System.out.printf("A primeira nota é: "+ n1 + "\n");
		System.out.printf("A segunda nota é: "+ n2 + "\n");
		System.out.printf("A terceira nota é: "+ n3 + "\n");
		System.out.printf("A quarta nota é: "+ n4 +"\n");
		
	}*/
}
