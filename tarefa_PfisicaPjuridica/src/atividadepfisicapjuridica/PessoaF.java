/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepfisicapjuridica;

/**
 *
 * @author LK_ESTUDO
 */
public class PessoaF extends Pessoa{
    
    private Integer cpf;
    private Double impostoF;
    
    public PessoaF(String nome, Integer anoCriacao, String numeroContato, Integer cpf, Double impostoF) {
        super(nome, anoCriacao, numeroContato);//SUPER CHAMA O MÉTODO DA CLASSE PAI
        //O THIS INICIALIZA UM ATRIBUTO ESPECÍFICO DA SUBCLASSE
        this.cpf = cpf; 
        this.impostoF = impostoF;
    }
    
    public Integer getCpf(){
        return cpf;
    }
    
    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }
    
    public Double getImpostoF(){
        return impostoF;
    }
    
    public void setImpostoF(Double impostoF){
        this.impostoF = impostoF;
    }
    
    @Override
    public void ficha(){
        System.out.println("Nome:" + getNome());
        System.out.println("Ano de Surgimento:" + getAnoCriacao());
        System.out.println("O número de contato é: " + getNumeroContato());
        System.out.println("O identificador CPF é:" + getCpf());
        System.out.println("A porcentagem paga de imposto é: " + getImpostoF()*10 + "%");
    }
}
