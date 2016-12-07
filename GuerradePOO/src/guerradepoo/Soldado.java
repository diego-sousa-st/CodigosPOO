/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerradepoo;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Soldado {
    private String nome;
    private int altura;
    private int idade;
    private int forca;
    private int velocidade;
    private int experiencia;
    private ArrayList<Arma> armas;
    private Arma armaAtual;
    private boolean estaVivo;
    private Tanque tanque;
    
    public Soldado(String nome, int altura, int idade, int forca, int velocidade, int experiencia, Arma arma){
        this.nome = nome;
        this.altura = altura;
        this.forca = forca;
        this.velocidade = velocidade;
        this.experiencia = experiencia;
        this.armaAtual = arma;
        armas = new ArrayList<Arma>();
        armas.add(arma);
        estaVivo = true;
        tanque = null;
    }
    
    public void entrarNoTanque(Tanque tanque){
        this.tanque = tanque;
    }
    
    public void atirar(){
        //TODO
        //chamar o metodo atirar da arma atual
    }
    
    public void tomarTiro(){
        
    }
    
    public void movimentar(){
        //TODO
        //Se estiver a pé só movimentar
        //senao usar o tanque para se movimentar 
    }
    
    public void coletarArma(Arma arma){
        armas.add(arma);
    }
    
}
