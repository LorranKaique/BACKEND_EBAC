/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepfisicapjuridica;

/**
 *
 * @author LK_ESTUDO
 */
public class Prog {
    
    public static void main(String[] args){
        PessoaF pf = new PessoaF("Karol",2001,"(67) 99609-2000",045,0.12d);
        
        PessoaJ pj = new PessoaJ("Hipo",2025,"(97)91256-2132",456622,0.25d);
        
        System.out.println("Ficha Pessoa Física: ");
        pf.ficha();
        System.out.println(" Ficha da pessoa Juridica:");
        pj.ficha();
    }
    
}
