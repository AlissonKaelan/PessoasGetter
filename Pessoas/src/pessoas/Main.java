/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

/**
 *
 * @author Alisson Kaelan
 */
public class Main {
    public static void main(String[] args) {
        //Criando objeto da classe pessoas
        Pessoas p = new Pessoas("alisson", 20, (float) 1.70);
        
        //Usando métodos acessores para obter os valores dos atributos
        System.out.println("Nome: " + p.getNome());
        
        System.out.println("Idade: " + p.getIdade());
        
        System.out.println("Altura: " + p.getAltura());
    }
    
}
