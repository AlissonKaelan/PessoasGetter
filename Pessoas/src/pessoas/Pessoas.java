/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoas;

/**
 *
 * @author Alisson Kaelan
 */
public class Pessoas {
    //Atibutos Privados
    private String nome;
    private int idade;
    private float altura;
    
    //Construtor
    public  Pessoas(String nome, int idade, float altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
   //Metodo acessor para o atributo nome
   public String getNome(){
        return nome;
   }
   //Metodo acessor para o atributo idade
   public int getIdade(){
       return idade;
   } 
   //Metodo acessor para o atributo altura
   public float getAltura(){
       return altura;
   } 
}
