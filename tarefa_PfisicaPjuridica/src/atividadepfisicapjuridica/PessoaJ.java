/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepfisicapjuridica;

/**
 *
 * @author LK_ESTUDO
 */
public class PessoaJ extends Pessoa{
    
    private Integer cnpj;
    private Double impostoJ;
    
    public PessoaJ(String nome, Integer anoCriacao, String numeroContato,Integer cnpj, Double impostoJ){
        super(nome, anoCriacao, numeroContato);
        this.cnpj = cnpj;
        this.impostoJ = impostoJ;
    }
    
    public Integer getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }
    
    public Double getImpostoJ(){
        return impostoJ;
    }
    
    public void setImpostoJ(Double impostoJ){
        this.impostoJ = impostoJ;
    }
    
    @Override
    public void ficha(){
        System.out.println("Nome:" + getNome());
        System.out.println("Ano de Surgimento:" + getAnoCriacao());
        System.out.println("O número de contato é: " + getNumeroContato());
        System.out.println("O identificador CPF é:" + getCnpj());
        System.out.println("A porcentagem paga de imposto é: " + getImpostoJ()*10 + "%");
    }
}
