/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package powerrangers;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RangerAmarelo amarelo = new RangerAmarelo("amarelo", "Trini Kwan", "adaga");
        RangerVermelho vermelho = new RangerVermelho("vermelho", "Jason Lee Scott", "espada");
        RangerAzul azul = new RangerAzul("Azul", "Billy Cranston", "lança");
        
        Megazord megazord = new Megazord("dino charge", "Poder dos dinossauros");
        
        amarelo.atacar();
        vermelho.atacar();
        azul.atacar();
        
        amarelo.defender();
        vermelho.defender();
        azul.defender();
        
        amarelo.usarPoderAcelerado();
        vermelho.liderarEquipe();
        azul.usarPoderAquático();
        
        amarelo.transformar();
        vermelho.transformar();
        azul.transformar();
        
        megazord.atacar();
        megazord.combinarZords();
    }
    
}
