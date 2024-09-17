/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package powerrangers;

/**
 *
 * @author aluno
 */
public class RangerAmarelo extends Ranger{
    
    public  void usarPoderAcelerado(){
        System.out.println("Usando poder acelerado");
    }

    public RangerAmarelo() {
    }

    public RangerAmarelo(String cor, String nome, String arma) {
        super(cor, nome, arma);
    }

    @Override
    public void atacar() {
        System.out.println("Ranger amarelo está atacando!");
    }
    
    @Override
    public void transformar() {
        System.out.println("Range amarelo está se transformando");
    }
    
    
    
}
