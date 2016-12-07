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
public class Canhao {
    private int numSerie;
    private int tamanho;
    private int capacidade;
    private int alcance;
    private int latencia;
    
    public Canhao(int numSerie, int tam, int capacidade, int alcance, int latencia){
        this.numSerie = numSerie;
        tamanho = tam;
        this.capacidade = capacidade;
        this.alcance = alcance;
        this.latencia = latencia;
    }
    
    public void atirar(){
        //TODO
        //verificar se precisa recarregar
    }
    
    private void recarregar(){
       //TODO 
    }
    
    public void setLatencia(int latencia){
        this.latencia = latencia;
    }
}
