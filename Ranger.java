/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package powerrangers;

/**
 *
 * @author aluno
 */
public class Ranger {
	
	private String cor;
	private String nome;
	private String arma;
	
	public Ranger() {
		
	}

        public Ranger(String cor, String nome, String arma) {
            this.cor = cor;
            this.nome = nome;
            this.arma = arma;
        }
	
        
        
	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getArma() {
		return arma;
	}



	public void setArma(String arma) {
		this.arma = arma;
	}

	public void atacar() {
	}
        
        public void defender(){
            System.out.println("Defendendo com a " + this.arma);
        }
        
        public void transformar(){
            
        }
        
}

