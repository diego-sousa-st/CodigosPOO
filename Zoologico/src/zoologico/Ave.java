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
public class Ave extends Animal{
    private boolean voaBem;
    
    public Ave(boolean voaBem,String nome, String especie, int qtdPatas, String som){
        super(nome, especie, qtdPatas, som);
        this.voaBem = voaBem;
    }
    
    public boolean getVoaBem(){
        return voaBem;
    }
    
    @Override
    public String dadosAnimal(){
        if(voaBem)
            return super.dadosAnimal()+"voa bem";
        return super.dadosAnimal()+"voa mal";
    }
}
