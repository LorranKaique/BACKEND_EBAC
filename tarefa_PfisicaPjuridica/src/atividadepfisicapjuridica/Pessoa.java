/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepfisicapjuridica;

/**
 *
 * @author LK_ESTUDO
 */
public abstract class Pessoa {

    private String nome;
    private Integer anoCriacao;
    private String numeroContato;
    
    public Pessoa(String nome, Integer anoCriacao, String numeroContato){
        this.anoCriacao = anoCriacao;
        this.nome = nome;
        this.numeroContato = numeroContato;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getAnoCriacao(){
        return anoCriacao;
    }
    
    public void setAnoCriacao(Integer anoCriacao){
        this.anoCriacao = anoCriacao;
    }
    
    public String getNumeroContato(){
        return numeroContato;
    }
    
    public void setNumeroContato(String numeroContato){
        this.numeroContato = numeroContato;
    }
    
    public abstract void ficha();
}
