/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package powerrangers;

/**
 *
 * @author aluno
 */
public class RangerVermelho extends Ranger {
    
    public void liderarEquipe(){
        System.out.println("Liderando a equipe");
    }

    public RangerVermelho() {
    }

    public RangerVermelho(String cor, String nome, String arma) {
        super(cor, nome, arma);
    }

    @Override
    public void atacar() {
        System.out.println("Ranger vermelho está atacando!");
    }

    @Override
    public void transformar() {
        System.out.println("Range vermelho está se transformando");
    }
    
    
    
    
}
