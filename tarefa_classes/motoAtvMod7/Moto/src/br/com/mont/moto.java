package br.com.mont;

public class moto {
	
	//atributos
	String piloto;
	private boolean ignicion;
	int vel;
	int marcha;
	
	//contrutor para começar com a moto desligada
	public moto() {
		this.ignicion = false;
	}
	
	//métodos
	/*primeira tentativa
	 * void ligar(ignition) {
		if (ignition ==  true) {
			ignition = false;
		}else {
			ignition = true;
		}
		return ignicion;
	}
	*/
	public boolean isLigado() {
		return ignicion;
	}
	
	public void ligar() {//liga a moto
		this.ignicion = !this.ignicion; //o '!' inverte o valor(this)
	}
	
	void acelerar(int aceleracao) {//acelera a moto
		if (ignicion == true) {
			vel+=aceleracao;
		}
	}
	
	void freiar(int reduzir) {//freia a moto
		vel-=reduzir;
	}
	
	void trocarMarcha() {//troca a marcha da moto
		if (vel > 0 && vel <20) {
			marcha = 1;
		}else if (vel < 40) {
			marcha = 2;
		}else if (vel < 60) {
			marcha = 3;
		}else if (vel < 80) {
			marcha = 4;
		}else {
			marcha = 5;
		}
	}
}
