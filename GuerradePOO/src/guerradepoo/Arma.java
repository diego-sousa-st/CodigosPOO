/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerradepoo;

/**
 *
 * @author diego
 */
public class Arma {
    private String nome;
    private int capacidade;
    private double peso;
    private int alcance;
    private int destruicao;
    private int calibre;
    
    public Arma(String nome, int cap, double peso, int alcance, int destruicao, int calibre){
        this.nome = nome;
        capacidade = cap;
        this.peso = peso;
        this.alcance = alcance;
        this.destruicao = destruicao;
        this.calibre = calibre;
    }
    
    public void atirar(){
        //TODO
    }
    
    public void recarregar(int qtdBalas){
        //TODO
    }
    
    public void AumentarCapacidade(int qtdBalas){
        this.capacidade = qtdBalas;
    }
}
