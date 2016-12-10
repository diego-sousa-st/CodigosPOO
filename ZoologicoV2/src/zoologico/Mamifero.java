/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico;

/**
 *
 * @author diego
 */
public abstract class Mamifero extends Animal{
    private String corPelo;
    
    public Mamifero(String corPelo,String nome, String especie, int qtdPatas, String som){
        super(nome, especie, qtdPatas, som);
        this.corPelo = corPelo;
    }
    
    public String getCorPelo(){
        return corPelo;
    }
    
    @Override
    public String dadosAnimal(){
        return super.dadosAnimal()+"tem pelo "+corPelo;
    }
}
