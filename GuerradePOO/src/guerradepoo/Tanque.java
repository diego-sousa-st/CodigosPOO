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
public class Tanque {
    private String nome;
    private int tamanho;
    private String cor;
    private int peso;
    private Canhao canhao;
    private int velocidade;

    public Tanque(String nome, int tamanho, String cor, int peso, int numSerie, int tam, int capacidade, int alcance, int latencia,
                    int velocidade){
        this.nome = nome;
        this.tamanho = tamanho;
        this.cor = cor;
        this.peso = peso;
        canhao = new Canhao(numSerie,tam,capacidade,alcance,latencia);        
    }
    
    public void atirar(){
       //TODO 
    }
    
    public void tomarTiro(){
        //TODO
        //Chama o metodo explodir
    }
    
    private void explodir(){
        //TODO
    }
    
    public void movimentar(String direcao){
        //TODO
    }
}
