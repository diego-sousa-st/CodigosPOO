/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa uma Ave no sistema
 * @author diego
 */
public abstract class Ave extends Animal{
    private boolean voaBem;
    /**
     * Construtor da classe Ave que cria uma nova ave usando o construtor da sua classe pai
     * @param voaBem boolean que representa se o animal voa bem ou mal
     * @param nome nome do animal
     * @param especie nome da especie do animal
     * @param qtdPatas numero de patas do animal
     * @param som som que o animal emite
     */
    public Ave(boolean voaBem,String nome, String especie, int qtdPatas, String som){
        super(nome, especie, qtdPatas, som);
        this.voaBem = voaBem;
    }
    /**
     * Método que retorna se o animal voa bem(true) ou mal(false)
     * @return true se voa bem e false se voa mal
     */
    public boolean getVoaBem(){
        return voaBem;
    }
    /**
     * Método sobrescrito que exibe todos os dados do animal dizendo se voa bem ou mal
     * @return 
     */
    @Override
    public String dadosAnimal(){
        if(voaBem)
            return super.dadosAnimal()+"voa bem";
        return super.dadosAnimal()+"voa mal";
    }    
}
