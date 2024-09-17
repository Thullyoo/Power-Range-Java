/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package powerrangers;

/**
 *
 * @author aluno
 */
public class RangerAzul extends Ranger {
 
    public void usarPoderAquático(){
        System.out.println("Usando poder Aquático");
    }

    public RangerAzul() {
    }

    public RangerAzul(String cor, String nome, String arma) {
        super(cor, nome, arma);
    }
    
    @Override
    public void atacar() {
        System.out.println("Ranger azul está atacando!");
    }

    @Override
    public void transformar() {
        System.out.println("Ranger azul está se transformando");
    }
    
}
