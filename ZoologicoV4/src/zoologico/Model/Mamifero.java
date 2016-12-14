/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.Model;

/**
 * Classe que representa um Mamifero no sistema
 * @author diego
 */
public abstract class Mamifero extends Animal{
    private String corPelo;
    /**
     * Construtor da classe Mamifero que cria um novo Mamifero utilizando o construtor da sua classe pai
     * @param corPelo cor do pelo do mamifero
     * @param nome nome do mamifero
     * @param especie nome da especie
     * @param qtdPatas numero de patas do animal
     * @param som som que o animal emite
     */
    public Mamifero(String corPelo,String nome, String especie, int qtdPatas, String som){
        super(nome, especie, qtdPatas, som);
        this.corPelo = corPelo;
    }
    /**
     * Método que retorna a cor do pelo de um mamifero
     * @return cor do pelo do mamifero
     */
    public String getCorPelo(){
        return corPelo;
    }
    /**
     * Método sobrescrito que exibe todos os dados do animal dizendo também qual a cor do pelo
     * @return 
     */
    @Override
    public String dadosAnimal(){
        return super.dadosAnimal()+"tem pelo "+corPelo;
    }
}
